#numbers=tuple(input("enter numbers").split(","))
numbers = (34, 45, 44, 87, 55)
for x in numbers:
    if x%5==0:
        print(x)
