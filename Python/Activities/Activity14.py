def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))
 
nterms =input("Enter a number: ")
 
if int(nterms) <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(int(nterms)):
        print(fibonacci(i))
