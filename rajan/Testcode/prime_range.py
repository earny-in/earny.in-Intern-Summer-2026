n = int(input("How many prime no. you want: "))
num = 2
printed = 0

while printed < n:
    b = True

    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            b = False
            break

    if b:
        print(num, end=" ")
        printed += 1

    num += 1