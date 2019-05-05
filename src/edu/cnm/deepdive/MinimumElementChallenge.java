package edu.cnm.deepdive;

import java.util.Scanner;

public class MinimumElementChallenge {

  public static Scanner scanner = new Scanner(System.in);

  public static int[] readIntegers(int count) {

    int[] intArray = new int[count];
    System.out.println("Please enter the numbers for the Array up to: " + count);
    for (int i = 0; i < count; i ++) {
      intArray[i] = scanner.nextInt();
    }

    return intArray;

  }

  public static int findMin(int[] array) {

    boolean flag = true;
    int holder;

    while (flag) {
      flag = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i + 1]) {
          holder = array[i];
          array[i] = array[i + 1];
          array[i + 1] = holder;
          flag = true;
        }
      }

    }

    return array[array.length - 1];
  }

  public static void main(String[] args) {
    System.out.println("Please enter your array size");
    int count = scanner.nextInt();
    int[] intArray = readIntegers(count);
    int min = findMin(intArray);
    System.out.println("The minimum value in the array is: " + min);
  }

}
