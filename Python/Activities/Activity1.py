username=input("Enter your name")
age=input("enter age")
newage= int(age)+100
print(username +"is " +age+ "years old")
newstr=username +" will be {} after 100 years "
print(newstr.format(newage))