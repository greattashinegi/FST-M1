listOne=[1,4,6,7,8]
listTwo=[66,77,87,89,5,4,22,1]
listThird= []
for x in listOne:
    if x%2!=0:
        listThird.append(x)
for y in listTwo:
    if y%2==0:
        listThird.append(y)

print(listThird)


