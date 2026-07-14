# Create an empty list
students = []

# Input names of 5 students
for i in range(5):
    name = input(f"Student {i + 1}: ")
    students.append(name)

# Display the attendance register
print("\nAttendance Register")
for i in range(5):
    print(f"{i + 1}. {students[i]}")