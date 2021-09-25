fruits = {
    "kiwi": 10,
    "strwaberry": 15,
    "gooseberry": 8,
    "peach": 15,
    "blueberry": 20
}

key = input("What are you looking for? ").lower()

if(key in fruits):
    print("Yes, this is available")
else:
    print("No, this is not available")