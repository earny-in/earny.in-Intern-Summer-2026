marks = []

# Input marks for 5 subjects
for i in range(5):
    mark = int(input(f"Subject{i+1}: "))
    marks.append(mark)

print("\nSubject Marks")

# Display all marks
for i in range(5):
 print(f"Subject{i+1}:{marks[i]}")