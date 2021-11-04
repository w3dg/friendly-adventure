public class Sort {

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

  public static void main(String[] args) {
    int n[] = { 55, 235, 373, 23, 3 };

    int m[] = new int[5];
    // Deep copy of array
    for (int i = 0; i < 5; i++) {
      m[i] = n[i];
    }

    insertionSort(n);
    bubbleSort(m);

    for (int i = 0; i < 5; i++) {
      System.out.println(m[i] + " " + n[i]);

    }
  }
}
