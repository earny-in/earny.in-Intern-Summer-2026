num = int(input("Enter a number: "))

count = 0
temp = num

while temp > 0:
    digit = temp % 10

    if num % digit == 0:
        count += 1

    temp = temp // 10

print("Count:", count)