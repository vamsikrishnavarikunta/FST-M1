	
fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15,
    "grapes":7
}
 
Fruit= input("What are you looking for? ").lower()
 
if(Fruit in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")