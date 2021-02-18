salary = int(input("Enter your salary "))
years = int(input("Enter your years of service "))

print("The bonus is", salary * 0.05 if years > 5 else 0)
