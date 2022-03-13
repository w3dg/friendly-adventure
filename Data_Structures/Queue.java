package Data_Structures;

import java.util.Scanner;

public class Queue {

  int arr[];
  int size;
  int front, rear;

  Queue(int s) {
    size = s;
    arr = new int[s];
    front = rear = -1;

  }

  void insert(int x) {
    if (rear + 1 == size) {

      System.out.println("Queue is full");
      return;
    }

    if (rear == -1)
      front = 0;

    arr[++rear] = x;
  }

  int remove() {
    if (rear == -1) {
      System.out.println("Queue is empty");
      return -99999;
    }

    int t = arr[front];

    if (front == rear) // only one left
      front = rear = -1;
    else
      front++;

    return t;
  }

  void display() {
    if (rear == -1) {
      System.out.println("Queue is empty");
      return;
    }
    for (int i = front; i <= rear; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter range");
    int range = sc.nextInt();
    Queue q = new Queue(range);

    for (int i = 0; i <= range; i++) {
      System.out.println("Enter a number");
      q.insert(sc.nextInt());
    }
    q.display();
    for (int i = 0; i < range; i++) {

      q.remove();
      q.display();
    }
  }
}
