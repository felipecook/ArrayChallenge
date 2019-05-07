package edu.cnm.deepdive;

public class ReverseArrayChallenge {

  public static void reverse(int[] array) {

    int maxIndex = array.length - 1;
    int halfwayIndex = array.length / 2;

    for (int i = 0; i < halfwayIndex; i++) {
      int holder = array[i];
      array[i] = array[maxIndex - i];
      array[maxIndex - i] = holder;

    }


//    int holderVar;
//    if (array.length <= 1) {
//      return;
//    }
//    if (array.length == 2) {
//      holderVar = array[0];
//      array[0] = array[1];
//      array[1] = holderVar;
//    }
//    holderVar = array[array.length - 1];
//    array[array.length - 1] = array[0];
//    array[0] = holderVar;
//    holderVar = array[1];

//    for (int i = 1; i < array.length - 2; i++) {
//      arrayReversed[i] = array[--holderVar];
//      array[i] = array[i + 1];
//    }
//    array[array.length -2] = holderVar;


  }



  public static void main(String[] args) {
    int[] intArray = {1, 3, 5, 6, 7};
    for (int number:
    intArray) {
      System.out.println(number);
    }
    reverse(intArray);
    for (int number:
        intArray) {
      System.out.println(number);
    }

  }


}
