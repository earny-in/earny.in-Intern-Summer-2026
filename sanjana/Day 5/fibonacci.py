# Program to print Fibonacci series

n = int(input("How many Fibonacci numbers do you want to print? "))

a = 0
b = 1

print("Fibonacci Series:")

for i in range(n):
    print(a, end=" ")
    c = a + b
    a = b
    b = c