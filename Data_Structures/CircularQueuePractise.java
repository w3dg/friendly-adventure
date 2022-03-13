package Data_Structures;

import java.util.Scanner;

public class CircularQueuePractise {

  int arr[];
  int size;
  int front, rear;

  CircularQueuePractise(int s) {
    size = s;
    arr = new int[s];
    front = rear = -1;

  }

  void insert(int x) {
    if (front == 0 && rear + 1 == size || rear + 1 == front) {

      System.out.println("Queue is full");
      return;
    }

    if (rear + 1 == size)
      rear = -1;
    if (front == -1)
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
    else if (front + 1 == size)
      front = 0;
    else
      front++;

    return t;
  }

  void display() {
    if (rear == -1) {
      System.out.println("Queue is empty");
      return;
    }

    if (front < rear) {
      for (int i = front; i <= rear; i++)
        System.out.print(arr[i] + " ");
      System.out.println();
    } else {
      for (int i = front; i < size; i++)
        System.out.print(arr[i] + " ");
      for (int i = 0; i <= rear; i++)
        System.out.print(arr[i] + " ");
      System.out.println();
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter range");
    int range = sc.nextInt();
    CircularQueuePractise q = new CircularQueuePractise(range);

    for (int i = 0; i <= range; i++) {
      System.out.println("Enter a number");
      q.insert(sc.nextInt());
    }
    q.display();
    for (int i = 0; i < range - 2; i++) {

      q.remove();

    }
    q.display();

    System.out.println("Enter a number");
    q.insert(sc.nextInt());

    q.display();
  }
}
