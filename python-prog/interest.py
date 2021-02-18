p = int(input("Enter Principal amount: "))
r = int(input("Enter rate of interest: "))
t = int(input("Enter Time Period of the loan in years: "))

si = p * r * t / 100

print("The simple interest is", si)

compi = (p * (1 + r / 100) ** t) - p

print("The compound interest annually is", compi)
