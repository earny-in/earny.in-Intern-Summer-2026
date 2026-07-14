def calculate_discount(original_price, discount_percentage):
    discount_amount = (original_price * discount_percentage) / 100
    final_price = original_price - discount_amount
    return discount_amount, final_price


# Main Program
original_price = float(input("Original Price: "))
discount_percentage = float(input("Discount Percentage: "))

discount_amount, final_price = calculate_discount(original_price, discount_percentage)

print("Discount Amount:", discount_amount)
print("Final Price:", final_price)