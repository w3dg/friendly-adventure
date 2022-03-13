package Sorts;

public class Sort {

  // Insertion sort
  static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  // Bubble Sort
  static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          int t = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = t;
        }
      }
    }
  }

  // Selection sort
  static void selectionSort(int arr[]) {
    int min;
    for (int i = 0; i < arr.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

  public static void main(String[] args) {
    int n[] = { 55, 235, 373, 23, 3 };

    int m[] = new int[5];
    int p[] = new int[5];
    // Deep copy of array
    for (int i = 0; i < 5; i++) {
      m[i] = n[i];
      p[i] = n[i];
    }

    insertionSort(n);
    bubbleSort(m);
    selectionSort(p);

    for (int i = 0; i < 5; i++) {
      System.out.println(m[i] + " " + n[i] + " " + p[i]);
    }
  }
}
