package Strings;

import java.util.Scanner;

// make multiple continuous spaces as 1??
// down below
// while(s.indexOf("  "," "))
// s = s.replace("  ", " ")

public class StringFractionSort {
  public static void main(String[] args) {
    String s = "";
    System.out.println("Enter fractions separated by spaces");
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine().trim();
    sc.close();
    if (s.length() == 0) {
      System.out.println("Empty String was inputted");
      System.exit(1);
    }

    // String s = "1/2 5/7 3/8 12/17 4/5"
    String arr[] = s.split(" ");

    float fracArr[] = new float[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int k = 0;
      float numerator = Integer.parseInt(arr[i].substring(k, arr[i].indexOf("/")));
      float denominator = Integer.parseInt(arr[i].substring(arr[i].indexOf("/") + 1));
      float frac = (numerator / denominator);
      fracArr[i] = frac;
    }

    for (int i = 0; i < fracArr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < fracArr.length; j++) {
        if (fracArr[j] < fracArr[min]) {
          min = j;
        }
      }
      float temp = fracArr[i];
      fracArr[i] = fracArr[min];
      fracArr[min] = temp;

      String temp2 = arr[i];
      arr[i] = arr[min];
      arr[min] = temp2;

    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
