// A superclass Perimeter has been defined to calculate the perimeter of a
// parallelogram. Define a subclass Area to compute the area of the
// parallelogram by using the required data members of the superclass. The
// details are given below

// Class name: Perimeter
// Data members/instance variables:
// a: to store the length in decimal
// b: to store the breadth in decimal
// Member functions:
// Perimeter (…): parameterized constructor to assign values to data members
// double Calculate(): calculate and return the perimeter of a parallelogram is
// 2\* (length + breadth)
// void show(): to display the data members along with the perimeter of the
// parallelogram

// Class name: Area
// Data members/instance variables:
// h: to store the height in decimal
// area: to store the area of the parallelogram
// Member functions:
// Area(…): parameterized constructor to assign values to data members of both
// the classes
// void doarea(): compute the area as (breadth \* height)
// void show(): display the data members of both classes along with the area and
// perimeter of the parallelogram.

===============================================================================================
superclass Number is defined to calculate the factorial of a number. Define a subclass Series to find the sum of the series S = 1! + 2! + 3! + 4! + ………. + n!
The details of the members of both classes are given below:
Class name: Number
Data member/instance variable:
n: to store an integer number
Member functions/methods:
Number(int nn): parameterized constructor to initialize the data member n=nn
int factorial(int a): returns the factorial of a number
(factorial of n = 1 × 2 × 3 × …… × n)
void display()
Class name: Series
Data member/instance variable:
sum: to store the sum of the series
Member functions/methods:
Series(…) : parameterized constructor to initialize the data members of both the classes
void calsum(): calculates the sum of the given series
void display(): displays the data members of both the classes

==================================================================

A superclass Bank has been defined to store the details of a customer. Define a sub-class Account that enables transactions for the customer with the bank. The details of both the classes are given below: [5]
Class name: Bank
Data members/instance variables:
name: stores the name of the customer
accno: stores the account number
P: stores the principal amount in decimals
Member functions/methods:
Bank(….): parameterized constructor to assign values to the instance variables
void display (): displays the details of the customer
Class name: Account
Data member/instance variable:
amt: stores the transaction amount in decimals
Member functions/methods:
Account(…): parameterized constructor to assign values to the instance variables of both the classes
void deposit(): accepts the amount and updates the principal as p=p+amt
void withdraw(): accepts the amount and updates the principal as p=p-amt
If the withdrawal amount is more than the principal amount, then display the message “INSUFFICIENT BALANCE”.
If the principal amount after withdrawal is less than 500, then a penalty is imposed by using the formula
p=p-(500-p)/10
