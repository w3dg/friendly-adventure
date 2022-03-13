package Miscellaneous;

class Pseudo {
  static boolean pseudo(int a[]) {
    int n = a.length;
    int m = a[0] + a[n - 1];

    for (int i = 1; i < n / 2; i++) {
      if (a[i] + a[n - 1 - i] != m)
        return false;
    }

    if (n % 2 != 0 && a[n / 2] * 2 != m)
      return false;

    return true;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 6, 8, 9, 12 };
    System.out.println(pseudo(arr));

    int arr2[] = { 2, 5, 7, 9, 12 };
    System.out.println(pseudo(arr2));

    int arr3[] = { 2, 5, 6, 7, 9, 12 };
    System.out.println(pseudo(arr3));

    // System.out.println(Math.rint(15.5) == Math.rint(16.5));
  }
}
