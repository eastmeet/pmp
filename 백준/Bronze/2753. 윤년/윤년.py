year = int(input())
leap_year = (year % 4 == 0) and ((year % 100 != 0) or (year % 400 == 0))
if leap_year:
	print(1)
else:
	print(0)
