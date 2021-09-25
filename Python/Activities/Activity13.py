
def calculate_sum(num):
	sum = 0
	for number in num:
		sum += number
	return sum


numList = [15, 45, 75, 100,120,200,250,300,120]


result = calculate_sum(numList)


print("The sum of all the elements is: " + str(result))