# Read input
n = int(input())

# Print right-angled triangle
for i in range(1, n + 1):
    for j in range(i):
        print("*", end="")
    print()