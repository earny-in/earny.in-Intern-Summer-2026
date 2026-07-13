temperature = [0] * 7

print("Enter temperature for 7 days:")

for i in range(7):
    temperature[i] = int(input("Day " + str(i + 1) + ": "))

print("\nWeekly Temperature Report")

for i in range(7):
    print("Day " + str(i + 1) + ": " + str(temperature[i]) + "°C")