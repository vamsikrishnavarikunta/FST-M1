numbers=tuple(input("Enter the tuple elements").split(","))
print("Numbers in tuple",numbers)
print("Numbers divisible by 5 from the tuple")
for i in numbers:
   if(int(i)%5==0):
        print(i)

