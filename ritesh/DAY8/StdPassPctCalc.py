def calculate_percentage(marks_obtained, maximum_marks):
    percentage = (marks_obtained / maximum_marks) * 100
    return percentage


# Main Program
marks_obtained = float(input("Marks Obtained: "))
maximum_marks = float(input("Maximum Marks: "))

percentage = calculate_percentage(marks_obtained, maximum_marks)

print(f"Percentage: {percentage:.1f}%")