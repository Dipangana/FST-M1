
list1 = [10, 30, 27, 99, 39]
list2 = [15, 45, 30, 41, 123]


print("First List ", list1)
print("Second List ", list2)


third = []


for num in list1:
    if (num % 2 != 0):
        third.append(num)
        

for num in list2:
    if (num % 2 == 0):
        third.append(num)


print("result List is:")
print(third)