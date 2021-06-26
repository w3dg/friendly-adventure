package Data_Structures;

import java.util.Scanner;

public class CircularQueue {

  int q[], front, rear, size;

  CircularQueue(int n) {
    size = n;
    q = new int[size];
    front = rear = -1;
  }

  void insert(int x) {
    if ((rear == (size - 1) && (front == 0)) || (rear + 1 == front)) // queue is full or not
    {
      System.out.println("Queue Overflow");
    } else if (front == -1) // queue is empty
    {
      front = rear = 0;
      q[rear] = x;
    } else if ((rear == (size - 1)) && (front > 0)) {
      rear = 0;
      q[rear] = x;
    } else {
      rear++;
      q[rear] = x;
    }
  }

  void delete() {
    int x;
    if (front == -1) {
      System.out.print("Queue underflow");
    } else {
      x = q[front]; // x is deleting the element
      System.out.print("Element deleted is" + x);
      if (front == rear)
        front = rear = -1; // reset positions
      else if (front == size - 1)
        front = 0;
      else
        front++;
    }
  }

  void display() {
    int i;
    if (front == -1) // empty queue
      System.out.print("Queue is empty");
    if (rear >= front) {
      for (i = front; i <= rear; i++)
        System.out.print(q[i] + " ");
    }

    else {
      for (i = front; i < size; i++)
        System.out.print(q[i] + " ");
      for (i = 0; i <= rear; i++)
        System.out.print(q[i] + " ");

    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the queue");
    int s = sc.nextInt();
    CircularQueue obj = new CircularQueue(s);
    boolean flag = true;

    while (flag) {
      System.out.println("\n 1. insert \t 2. delete \t 3. display \t 4.Exit");
      System.out.println("Enter your choice:");
      int ch = sc.nextInt();
      switch (ch) {
      case 1:
        System.out.println("Enter an element for insertion");
        int x = sc.nextInt();
        obj.insert(x);
        break;
      case 2:
        obj.delete();
        break;
      case 3:
        obj.display();
        break;
      case 4:
        flag = false;
        break;
      default:
        System.out.println("Please re-enter with a valid choice");
        break;
      }
    }
    sc.close();
  }
}