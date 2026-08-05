temperatures = []

for i in range (7):
    temperature = (input(f"Day{i+1}: "))
    temperatures.append(temperature)

print("weekly Temperature Report")


for i in range(7):
    print(f"Day {i + 1}: {temperatures[i]}\u00B0C")