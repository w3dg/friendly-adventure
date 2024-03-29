import java.util.Scanner;
/*
A class Gcd has been defined to find the Greatest Common Divisor of two
integer numbers. Some of the members of the class are given below:
Class name
:
Gcd
Data member/instance variable:
num1
:
integer to store the first number
num2
:
integer to store the second number
Member functions/methods:
Gcd( )
:
default constructor
void accept( )
:
to accept the numbers
int gcd(int x,int y)
:
return the GCD of the two number x
and y using recursive technique
void display( )
:
displays the result with an appropriate
message
Specify the class Gcd, giving details of the Constructor, void accept( ), int
gcd(int,int), and void display( ). Define the main() function to create an object
and call the functions accordingly to enable the task.*/

public class Gcd {
  int num1, num2;

  Gcd() {
    num1 = 0;
    num2 = 0;
  }

  void accept() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter two numbers");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
    }
  }

  // Euclidean Algorithm
  int gcd(int x, int y) {
    if (y == 0) {
      return x;
    } else
      return gcd(y, x % y);
  }
}
