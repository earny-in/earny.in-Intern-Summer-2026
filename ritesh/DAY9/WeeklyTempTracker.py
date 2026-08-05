# Create an empty list
temperatures = []

# Input temperatures for 7 days
for i in range(7):
    temp = int(input(f"Day {i + 1}: "))
    temperatures.append(temp)

# Display the weekly temperature report
print("\nWeekly Temperature Report")
for i in range(7):
    print(f"Day {i + 1}: {temperatures[i]}°C")
    