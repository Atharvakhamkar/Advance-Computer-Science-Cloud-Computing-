# This line counts how many people survived (1) and died (0)
survival_counts = np.bincount(data['Survived'].dropna().astype(int))
print(f"Died: {survival_counts[0]}, Survived: {survival_counts[1]}")
