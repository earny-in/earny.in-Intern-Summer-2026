n = int(input("Enter the size of square: "))

print("*" * n) 
for i in range(n - 2):
    print("*" + " " * (n - 2) + "*")
print("*" * n)