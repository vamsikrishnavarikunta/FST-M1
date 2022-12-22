list1=[10,20,30,15]
print("values in list1",list1)
list2=[13,9,7,6,5,4,2]
print("values in list2",list2)
list3=[]
for i in list1:
   if (i%2!=0):
        list3.append(i)
for j in list2:
    if (j%2==0):
        list3.append(j)
print("list 3 with odd numbers from list 1 and even numbers from list2",list3)