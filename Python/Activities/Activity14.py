def fibonacci(number):
    if(number<=1):
        return number
    else:
        return fibonacci(number-1)+fibonacci(number-2)
number=int(input("Enter number:"))
if number <=0:
    print("enter valid num")
else:
    print("fib seq")
    for i in range(number):
        print(fibonacci(i))