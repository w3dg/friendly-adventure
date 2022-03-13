package Recursion;

// using loop
class BinarySearch {
  public static int binsearchloop(int a[], int s) {
    int l = 0, u = a.length - 1, mid = 0;
    while (l <= u) {
      mid = (l + u) / 2;
      if (a[mid] < s)
        l = mid + 1;
      else if (a[mid] > s)
        u = mid - 1;
      else
        return mid;
    }
    return -1;
  }

  // using recursion
  public static int binsearchrec(int[] a, int s, int l, int u) {
    if (l > u)
      return -1;
    int mid = (l + u) / 2;
    if (a[mid] < s) {
      binsearchrec(a, s, mid + 1, u);
    } else if (a[mid] > s)
      binsearchrec(a, s, l, mid - 1);
    else
      return mid;
    return mid;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 7, 8, 9, 10, 15 };
    int b[] = { 4, 1, 8, 11, 17, 15 };

    for (int i = 0; i < b.length; i++) {
      System.out.println(binsearchrec(arr, b[i], 0, arr.length - 1) == 1 ? "present" : "absent");
      System.out.println(binsearchloop(arr, b[i]) == 1 ? "present" : "absent");
    }
  }
}
