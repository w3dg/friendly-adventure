package Data_Structures;

import java.util.Scanner;

class StackZero {
  int s[], top, size;

  StackZero(int n) {
    size = n;
    s = new int[size];
    top = 0; // no top as there are no elements till now.
  }

  void push(int x) {
    if (top == size) // full, cannot push any more items.
      System.out.println("Stack Overflow");
    else
      s[top++] = x;
  }

  void pop() {
    int x;
    if (top == 0) // empty ( this is what we started with )
      System.out.println("Stack Underflow");
    else {
      x = s[--top]; // top is one step ahead. Proper value is not removed with top--
      System.out.println("Element deleted is=" + x);
    }
  }

  void display() {
    System.out.println("Elements of the stack are as follows:\n");
    for (int i = 0; i < top; i++)
      System.out.print(s[i] + " ");
  }
}

class StackProgramModified {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the stack");
    int s = sc.nextInt();
    StackZero obj = new StackZero(s);
    System.out.println("\n 1.push \t 2. pop \t 3.display \t 4. Exit");
    boolean flag = true;
    while (flag) {
      System.out.println("\nEnter your choice:");
      int c = sc.nextInt();
      switch (c) {
        case 1:
          System.out.println("Enter an element for insertion");
          int x = sc.nextInt();
          obj.push(x);
          break;
        case 2:
          obj.pop();
          break;
        case 3:
          obj.display();
          break;
        case 4:
          flag = false;
          break;

        default:

          System.out.println("Please enter a valid choice");
          break;

      }
    }
    sc.close();
  }
}