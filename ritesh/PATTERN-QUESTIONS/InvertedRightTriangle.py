# Read input
n = int(input())

# Print inverted right-angled triangle
for i in range(n, 0, -1):
    for j in range(i):
        print("*", end="")
    print()