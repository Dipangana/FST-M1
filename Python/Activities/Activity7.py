a_list = []
print("Please enter 10 numbers with or without decimals\n")

for num in range(10):
    list_num = float(input("Enter a number:"))
    a_list.append(list_num)
print(sum(a_list))