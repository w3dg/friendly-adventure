package Data_Structures;

import java.util.Scanner;

public class DynamicStack {
  int s[], top, size;

  DynamicStack(int n) {
    size = n;
    s = new int[n];
    top = -1;
  }

  void push(int x) {
    if (top + 1 >= size) {
      int st[] = new int[(size * 2)];

      for (int i = 0; i < size; i++) {
        st[i] = s[i];
      }
      s = st;
      size = st.length;
    }
    s[++top] = x;
  }

  int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -99999;
    }
    return s[top--];
  }

  void display() {
    if (top == -1) {
      System.out.println("Stack Underflow No elements");
    } else {
      for (int i = 0; i < top; i++) {
        System.out.println(s[i]);
      }
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of stack");
    int x = s.nextInt();
    DynamicStack obj = new DynamicStack(x);

    boolean flag = true;
    while (flag) {
      System.out.println("\n 1. Push 2. Pop 3. Display 4. Exit");
      int ch = s.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter a number to push in the stack");
          int n = s.nextInt();
          obj.push(n);
          break;

        case 2:
          int res = obj.pop();
          System.out.println("Popped of the stack" + res);

          break;

        case 3:
          obj.display();
          break;

        case 4:
          flag = false;
          break;

        default:
          System.out.println("Wrong input!, Please try again!");
      }
    }
    s.close();
  }
}
