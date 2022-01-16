package Inheritance;

import java.util.Scanner;

class Record {
  String name[];
  int marks[];
  int size;

  Record(int cap) {
    size = cap;
    name = new String[size];
    marks = new int[size];
  }

  void readarray() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      name[i] = sc.nextLine();
      marks[i] = sc.nextInt();
      sc.nextLine();
    }
  }

  void display() {
    for (int i = 0; i < size; i++) {
      System.out.println("Name: " + name[i] + " marks: " + marks[i]);
    }
  }
}

public class Highest extends Record {
  int ind;

  public Highest(int size) {
    super(size);
    ind = 0;
  }

  void find() {
    readarray();

    for (int i = 1; i < size; i++) {
      if (marks[i] > marks[ind])
        ind = i;
    }
  }

  void display() {
    find();
    super.display();
    System.out.println("name of topper: " + name[ind] + "Highest marks:" + marks[ind]);
  }
}