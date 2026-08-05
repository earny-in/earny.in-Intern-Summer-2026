students = []

for i in range(5):
    Name = input(f"student{i+1}: ")
    students.append(Name)

print("\nAttendance Register")

for i in range(5):
    print(f"student{i+1}:{students[i]}")