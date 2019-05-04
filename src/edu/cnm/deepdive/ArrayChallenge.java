package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int integerSize = getIntegerArraySize();
    int[] myIntArray = getIntegers(integerSize);

    printArray(myIntArray);
    System.out.println();
    printArray(sortArray(myIntArray));



  }

  public static void printArray(int[] myIntArray) {

   for (int i = 0; i < myIntArray.length; i++) {
     System.out.println("Element " + i + " is: " + myIntArray[i]);
   }

  }

  public static int[] sortArray(int[] unsortedArray) {

    int[] sortedArray = new int[unsortedArray.length];

    for (int i = 0; i < unsortedArray.length; i++) {
      sortedArray[i] = unsortedArray[i];
    }

    boolean flag = true;
    int temp;

    while (flag) {
      flag = false;

      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArray;

//    return Arrays.sort(unsortedArray, Collections.reverseOrder());
  }


  public static int getIntegerArraySize() {
    System.out.println("Enter a size for your array. \r");
    return scanner.nextInt();
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values.\r");
    int[] values = new int[number];
    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }



}
