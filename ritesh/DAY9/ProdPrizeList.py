# Create an empty list
prices = []

# Input prices of 5 products
for i in range(5):
    price = int(input(f"Enter price of Product {i + 1}: "))
    prices.append(price)

# Display the product price list
print("\nProduct Price List")
for i in range(5):
    print(f"Product {i + 1} : ₹{prices[i]}")
    