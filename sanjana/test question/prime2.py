n = int(input("How many prime numbers do you want to print?"))

count = 0
num = 2

while count < n:
    prime = True

    for i in range(2,num):
     if num % i == 0:
        prime = False
        break
     
    if prime:
      print(num, end=" ")
      count = count + 1
    num = num + 1