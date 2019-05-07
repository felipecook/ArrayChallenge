package edu.cnm.deepdive;

public class ReverseArrayChallenge {

  public static void reverse(int[] array) {
//    int[] arrayReversed = new int[array.length];
    int holderVar;


    for (int i = 0; i < array.length; i++) {
//      arrayReversed[i] = array[--holderVar];
      holderVar = array[i];
      array[i] = array[i + 1];
    }
  }

  public static void main(String[] args) {
    int[] intArray = {1, 3, 5, 6, 7};
    System.out.println(intArray);
    reverse(intArray);
    System.out.println(intArray);
  }


}
