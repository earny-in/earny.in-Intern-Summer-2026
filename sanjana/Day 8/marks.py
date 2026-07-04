# Function to calculate total marks
def calculate_total_marks(maths, science, english):
    total = maths + science + english
    return total


# Main Program
maths = int(input("Mathematics: "))
science = int(input("Science: "))
english = int(input("English: "))

total_marks = calculate_total_marks(maths, science, english)

print("Total Marks:", total_marks)