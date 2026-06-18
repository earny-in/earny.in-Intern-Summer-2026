n = int(input("Enter how many Armstrong numbers to print: "))

count = 0
num = 1

while count < n:
    temp = num
    digits = len(str(num))
    total = 0

    while temp > 0:
        digit = temp % 10
        total += digit ** digits
        temp //= 10

    # Handle single-digit numbers (0-9 are Armstrong numbers)
    if num == 0:
        total = 0

    if total == num:
        print(num, end=" ")
        count += 1

    num += 1