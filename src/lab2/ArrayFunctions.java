package lab2;

public class ArrayFunctions {
    public static int findMax(int[] promptArray) {
        int maxIndex = 0;
        for (int i = 0; i < promptArray.length; i++) {
            if (promptArray[i] > promptArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static double findAvg(int[] promptArray){
        double sum = 0;
        for (int num : promptArray) {
            sum += num;
//            sum = sum + num;
        }
//        for (int k=0; k < promptArray.length; k++){
//            sum = sum + promptArray[k];
//        }
        return (double) sum/promptArray.length;
    }


    public static void display(int[] promptArray){
        for (int num: promptArray){
            System.out.print(num + "");
        }
        System.out.println();
    }

    public static void swap(int[] promptArray, int i, int j){
        int temp = promptArray[i];
        promptArray[i] = promptArray[j];
        promptArray[j] = temp;
    }


}
