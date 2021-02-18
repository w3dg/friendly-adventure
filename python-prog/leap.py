year = int(input("Enter a year: "))

if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print("Leap year")
else:
    print("Not a leap year")

# print(year , "was", "Leap year" if year % 4 == 0 and year % 100 != 0 or year % 400 == 0 else "Not leap year")
