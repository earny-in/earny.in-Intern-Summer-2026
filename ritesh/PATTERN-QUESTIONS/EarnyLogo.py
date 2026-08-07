n = int(input())

for i in range(n):

    # E
    for j in range(n):
        if j == 0 or i == 0 or i == n // 2 or i == n - 1:
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    # A
    for j in range(n):
        if j == 0 or j == n - 1 or i == 0 or i == n // 2:
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    # R
    for j in range(n):
        if (
            j == 0
            or i == 0
            or i == n // 2
            or (j == n - 1 and i < n // 2)
            or (i - j == n // 2)
        ):
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    # N
    for j in range(n):
        if j == 0 or j == n - 1 or i == j:
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    # Y
    for j in range(n):
        if (i <= n // 2 and (i == j or i + j == n - 1)) or (i > n // 2 and j == n // 2):
            print("*", end="")
        else:
            print(" ", end="")

    print()