package Strings;

import java.util.Scanner;

public class StringNumberSort {

  public static void main(String args[]) {
    String s = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string of numbers separated by spaces");
    s = sc.nextLine().trim();
    sc.close();
    if (s.length() == 0) {
      System.out.println("Empty String was inputted");
      System.exit(1);
    }
    String strArr[] = s.split(" ");
    int arr[] = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
