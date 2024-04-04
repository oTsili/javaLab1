package lab2;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        // Read the size of the array
        int size = lab1.UserInput.getInteger("Enter the size of the array");
        // Save to array
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = lab1.UserInput.getInteger("Enter an element to be entered");
        }

        System.out.println(Arrays.toString(array));


    }


}
