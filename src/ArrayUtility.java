public class ArrayUtility {

    public static void print(int[] array) {
        String printThing = "";
        for (int i: array){
            printThing += i + ", ";
        }
        System.out.println(printThing.substring(0, printThing.length() - 2));
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i: array){
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i: array) {
            sum += i;
        }
        double average = sum / array.length;
        int truncate = (int) (average * 100);
        return truncate / 100.0; //.0 makes it a double
    }

    public static int minimum(int[] array){
        int minimum = 0;
        for (int i = 0;i < array.length;i++){
            if (i == 0){
                minimum = array[i];
            }
            else if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array){
        int max = 0;
        for (int i = 0;i < array.length;i++){
            if (i == 0){
                max = array[i];
            }
            else if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i: array){
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] returnArray = new int[array.length];
        for (int i = 0;i < array.length;i++){
            returnArray[i] = array[array.length - 1 - i];
        }
        return returnArray;
    }

    public static void reverseTwo(int[] array) {
        int[] returnArray = new int[array.length];
        for (int i = 0;i < array.length;i++){
            returnArray[i] = array[array.length - 1 - i];
        }
        for (int i = 0;i < array.length;i++){
            array[i] = returnArray[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i: array){
            if (i == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String i: array){
            if (i.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0;i < array.length;i++){
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0;i < array.length;i++){
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String returnThing = "";
        for (int i = 0; i < array.length;i++){
            returnThing += "" + array[i] + ", ";
        }
        return returnThing.substring(0, returnThing.length() - 2);
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                if (array[i] + array[j] == num && i != j){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0;i < array.length;i++){
            if (i == 0){
                temp[i] = array[array.length - 1];
            }
            else {
                temp[i] = array[i - 1];
            }
        }
        for (int i = 0;i < array.length;i++){
            array[i] = temp[i];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0;i < array.length;i++){
            if (i == array.length - 1){
                temp[i] = array[0];
            }
            else {
                temp[i] = array[i + 1];
            }
        }
        for (int i = 0;i < array.length;i++){
            array[i] = temp[i];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = array[array.length - n + i];
        }
        for (int i = array.length - 1; i >= n; i--) {
            array[i] = array[i - n];
        }
        for (int i = 0; i < n; i++) {
            array[i] = arrayN[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = array[i];
        }
        for (int i = 0; i < array.length - n; i++) {
            array[i] = array[i + n];
        }
        for (int i = 0; i < n; i++) {
            array[array.length - n + i] = arrayN[i];
        }
    }
}
