num = int(input("please give a number: "))


def fact(n):
    if n == 0:
        return 1
    return n * fact(n - 1)


# if num < 0:
#     print("No factorial of negative numbers")
# else:
#     print(fact(num))


# for i in range(num):
#     print(i)
