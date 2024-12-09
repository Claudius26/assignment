sumtaskseven = 0
for number in range(1,11):
	if (number % 4 == 0):
		value = 1
		sumtasksix = 0
		for _ in range(5):
			value *= number
			sumtasksix += value
		sumtaskseven += sumtasksix
	squaresumtaskeight = sumtaskseven * sumtaskseven
print(squaresumtaskeight)