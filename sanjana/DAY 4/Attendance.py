present=0
absent=0

for i in range(1,11):
    status = input(f"student {i} (P/A):")

    if status =="P":
        present+=1
    elif status == "A":
        absent +=1
        
        print("Present students:",present)
        print("Absent students:",absent)