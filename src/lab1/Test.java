package lab1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] intArray = new int[10];
//        intArray[1] = 3;
//        intArray[3] = 5;
//        for (int i = 0; i < intArray.length; i++){
//            intArray[i] = i+1;
//        }


//        int[] intArray = new int[]{1,3,4, 676, 65};
        int[] intArray = {1,3,56,98,8};

        System.out.println(intArray.length);
//        14,24,34,4,8
//        45,34.89,4,3
//        45,34.89,4,3

      int[][] int2dArray =  {
              {14,24,34,4,8},
              {45, 34,89,4,3},
              {45, 34,89,4,3}
      };

        System.out.println(int2dArray[2][1]);
        System.out.println(Arrays.deepToString(int2dArray));
        System.out.println(int2dArray.length);
//        System.out.println(intArray[2]);
//        System.out.println(Arrays.toString(intArray));
    }
}
