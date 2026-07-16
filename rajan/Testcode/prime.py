n = int(input("Enter a number: "))

if n <= 1:
    print(n, "is not a Prime Number")
else:
    b = True

    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            b = False
            break

    if b:
        print(n, "is a Prime Number")
    else:
        print(n, "is not a Prime Number")