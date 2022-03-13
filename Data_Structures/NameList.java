package Data_Structures;

import java.util.Scanner;
// do a  circular queue for names in a doctor's chamber

public class NameList {

  String names[];
  int size;
  int front, rear;

  NameList(int s) {
    size = s;
    names = new String[s];
    front = rear = -1;
  }

  void insertAppointment(String name) {
    if (front == 0 && rear + 1 == size || rear + 1 == front) {
      System.out.println("Full. No more appointments can be made.");
      return;
    }

    if (rear + 1 == size)
      rear = -1;
    if (front == -1)
      front = 0;

    names[++rear] = name;
  }

  String removeAppointment() {
    if (rear == -1) {
      System.out.println("No appointments to remove.");
      return "";
    }
    String t = names[front];
    if (front == rear) // only one name left
    {
      front = rear = -1;
    } else if (front + 1 == size) {
      front = 0;
    } else {
      front++;
    }
    return t;
  }

  void displayAppointments() {
    if (rear == -1) {
      System.out.println("No appointments so far");
    }
    // normal so far
    if (front < rear) {
      for (int i = front; i <= rear; i++) {
        System.out.print(names[i] + " ");
      }
      System.out.println("");
    }
    // have made it into circular
    else {
      // 1st part
      for (int i = front; i < size; i++)
        System.out.print(names[i] + " ");
      // 2nd, circular part
      for (int i = 0; i <= rear; i++)
        System.out.print(names[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

  }
}
