# Function to check prime number
def is_prime(num):
    if num < 2:
        return False

    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False

    return True


# User input
n = int(input("How many prime numbers do you want to print? "))

count = 0
number = 2

print("First", n, "prime numbers are:")

while count < n:
    if is_prime(number):
        print(number, end=" ")
        count += 1
    number += 1