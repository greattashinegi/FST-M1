a=int(input("enter number"))
#total=0;
def sum(a):
    if(a==0):
        return 0
    print("inside")
    return a+sum(a-1)

res=sum(a)
print(res)