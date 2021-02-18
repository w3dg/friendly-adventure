a = int(input("Enter first side of triangle "))
b = int(input("Enter second side of triangle "))
c = int(input("Enter third side of triangle "))

if a == b and b == c:
    print("Equilateral triangle")
elif a != b and b != c:
    print("Scalene triangle")
else:
    print("Isosceles triangle")
