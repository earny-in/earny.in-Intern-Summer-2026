def calculate_area(length, width):
    area = length * width
    return area


# Main Program
length = float(input("Length: "))
width = float(input("Width: "))

area = calculate_area(length, width)

print("Area of Rectangle:", area)