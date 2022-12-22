	
numbers = list(input("Enter a sequence of comma separated values: ").split(","))
length=len(numbers)
print("Length of the LIST is:",length)
print("elements in list are:",numbers)
if(numbers[0]==numbers[length-1]):
  print("TRUE")
else:
  print("FALSE")

