# Read input
n = int(input())

# Print solid square pattern
for i in range(n):
    for j in range(n):
        print("*", end="")
    print()