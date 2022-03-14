
// A class Fibo has been defined to generate the Fibonacci series 0, 1, 1, 2, 3, 5,
// 8, 13,……. (Fibonacci series are those in which the sum of the previous two
// terms is equal to the next term).

/*
Some of the members of the class are given below:
Class name
:
Fibo
Data member/instance variable:
start
:
integer to store the start value
end
:
integer to store the end value
Member functions/methods:
Fibo( )
:
default constructor
void read( )
:
to accept the numbers
int fibo(int n)
:
return the nth term of a Fibonacci series
using recursive technique
void display( )
:
displays the Fibonacci series from start
to end by invoking the function fibo()
Specify the class Fibo, giving details of the Constructor, void read( ), int
fibo(int), and void display( ). Define the main() function to create an object and
call the functions accordingly to enable the task.

*/
import java.util.*;

public class Fibo {
  int start, end;

  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Start and End Limits");
    start = sc.nextInt();
    end = sc.nextInt();
    sc.close();
  }

  int fibo(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;
    return fibo(n - 1) + fibo(n - 2);
  }

  void display() {
    System.out.println(fibo(5));
    System.out.println(fibo(3));
    System.out.println(fibo(10));
  }

  public static void main(String[] args) {
    new Fibo().display();
  }

}
