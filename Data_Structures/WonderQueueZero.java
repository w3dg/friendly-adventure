package Data_Structures;

public class WonderQueueZero {
  int a[];
  int cap;
  int front, rear;

  WonderQueueZero(int c) {
    cap = c;
    a = new int[cap];
    front = 0;
    rear = 0;
  }

  void insert(int x) {
    if (rear == cap) {
      System.out.println("queue full");
      return;
    }
    if (front == 0)
      front = 1;

    a[rear++] = x;

  }

  int delete() {
    if (front == 0) {
      System.out.println("queue empty");
      return -999;
    }
    int t = a[front - 1]; // MIND IT!
    if (front == rear)

      front = rear = 0;
    else
      front++;
    return t;

  }

  void display() {
    if (front == 0) {
      System.out.println("queue empty");
      return;
    }
    for (int i = front - 1; i < rear; i++)
      System.out.print(a[i] + "    ");
  }

}