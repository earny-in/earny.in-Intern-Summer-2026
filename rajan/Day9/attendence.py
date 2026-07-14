std = []

print("Enter the names of 5 students:")
for i in range(5):
    std.append(input("Student " + str(i + 1) + ": "))

print("\nAttendance Register")
num = 1
for name in std:
    print(str(num) + ". " + name)
    num += 1