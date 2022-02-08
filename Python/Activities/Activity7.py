numbers=list(input("enter numbers").split(","))
total=0
for number in numbers:
    total=total+int(number)

print(total)