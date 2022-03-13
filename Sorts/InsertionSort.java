package Sorts;

import java.util.Scanner;

public class InsertionSort {

  int arr[];
  static Scanner sc = new Scanner(System.in);

  void insert(int size) {
    arr = new int[size];

    System.out.println("Enter " + size + " no of elements into the array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  void display() {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  void insertionSort() {

    /*
     * 
     * mark first element as sorted for each unsorted element X 'extract' the
     * element X for j <- lastSortedIndex down to 0 if current element j > X move
     * sorted element to the right by 1 break loop and insert X here
     * 
     */

    int n = this.arr.length;
    for (int j = 1; j < n; j++) {
      int key = this.arr[j];

      int i = j - 1;
      while ((i > -1) && this.arr[i] > key) {
        this.arr[i + 1] = this.arr[i];
        i--;
      }
      this.arr[i + 1] = key;
    }

  }

  public static void main(String[] args) {

    InsertionSort obj = new InsertionSort();
    System.out.println("Enter the no of elements to put in the array");
    int size = sc.nextInt();

    obj.insert(size);
    obj.insertionSort();
    obj.display();
  }
}
