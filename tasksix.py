for number in range(1,11):
	if (number % 4 == 0):
		value = 1
		for _ in range(5):
			value *= number
			print(value)