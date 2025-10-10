import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

data = pd.read_csv('train.csv')
print(data.head())


# labels = ['Died' , 'Survived']
# counts = survival_counts

# plt.bar(labels, counts, color=['red','green'])
# plt.title('Number of people Survived and Died')

# plt.ylabel('Counts')
# plt.show()
# This line counts how many people survived (1) and died (0)
survival_counts = np.bincount(data['Survived'].dropna().astype(int))
# print(f"Died: {survival_counts[0]}, Survived: {survival_counts[1]}")

labels = ['Died', 'Survived']
counts = survival_counts



plt.bar(labels, counts, color=['red', 'green'])
plt.title('Number of People Survived and Died')
plt.ylabel('Count')
plt.show()
