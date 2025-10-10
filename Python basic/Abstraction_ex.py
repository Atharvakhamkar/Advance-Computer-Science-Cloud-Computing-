from abc import *

# Case 1:
# class Test:  
#     pass
# t=Test()


# Case 2:
# class Test(ABC):         
#      def spam(self):      
#          print("Test Class")   
# t=Test()  #--> to create obj 
# t.spam()  #--> it is the mehtod called by obj name "t.spam" 
# Test.spam(t)  

# Case 3:
# class Test:
#     @abstractmethod
#     def spam(self):
#         print("Test Class")
#
# t=Test()
# t.spam()


# Case 4:
# class Test(ABC):
#     @abstractmethod
#     def spam(self):
#         print("Test Class")
#
# t=Test()






# from abc import ABC,abstractmethod
# class Test(ABC):
#     @abstractmethod
#     def spam(self):
#         pass
#
# class Test1(Test):
#     def spam(self):  #declaration
#         print("Test Class")   #implementation
#
# t=Test1()
# t.spam()


# from abc import ABC,abstractmethod
# class Student(ABC):
#     @abstractmethod
#     def study(self):
#         pass
#
#     @abstractmethod
#     def Notes(self):
#         pass
#
# class Student2(Student):
#     def study(self):
#         print("Studying python")
#
#     def Notes(self):
#         print("Python notes")
#
# x=Student2()
# x.Notes()
# x.study()


# from abc import ABC,abstractmethod
# class Student(ABC):
#     @abstractmethod
#     def Sub(self):
#         pass
#
#     @abstractmethod
#     def Loc(self):
#         pass
#
#     @abstractmethod
#     def Name(self):
#         pass
#
# class Student2(Student):
#     def Sub(self):
#         print("Im Studying python subject.")
#
#     def Loc(self):
#         print("Current location is Pune.")
#
#     def Name(self):
#         print("My name is Siya.")
#
# s=Student2()
# s.Sub()
# s.Loc()
# s.Name()


# from abc import ABC,abstractmethod
# class ICIC_Bank(ABC):
#     @abstractmethod
#     def Bal(self):
#         pass
#
#     @abstractmethod
#     def Deposit(self,amount):
#         ...
#
#     @abstractmethod
#     def Withdrawal(self,amount):
#         None
#
# class ATM(ICIC_Bank):
#     def __init__(self,Acc_holder_name,bal):
#         self.name=Acc_holder_name
#         self.bal=bal
#
#     def Bal(self):
#         print(f'My name is {self.name} and total balance is {self.bal}')
#
#     def Deposit(self,amount):
#         self.bal+=amount
#         print(f'Deposited amount is {amount}'
#                f' and After depositing total amount is {self.bal}')
#
#     def Withdrawal(self,amount):
#         self.bal-=amount
#         print(f'Withdrawal amount is {amount}'
#               f' and After withdrawal total amount is {self.bal}')
#
# a=ATM("Siya",10000)
# a.Bal()
# a.Deposit(5000)
# a.Withdrawal(2500)


from abc import ABC,abstractmethod

class SBI_Bank(ABC):
    def Bal(self):
        pass
    def Deposit(self):
        None
    def Withdrawal(self):
        ...

class ATM(SBI_Bank):
    def __init__(self,ACC_holder_name,balance):
        self.name=ACC_holder_name
        self.bal=balance
    def Bal(self):
        print(f'My name is {self.name} and balance is {self.bal}')
    def Deposit(self,amount):
        self.bal+=amount
        print(f'Deposited amount is {amount} and after deposit amount will be {self.bal}')
    def Withdrawal(self,amount):
        self.bal-=amount
        print(f'The Withdrawal amount is {amount} and After withdraw the amount left will be {self.bal}')
a=ATM("Hrituja",700000)
a.Bal()
a.Deposit(70000)
a.Withdrawal(70000)


