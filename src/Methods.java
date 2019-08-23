import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] inputArray1 = {1, 2, 4, 2, 5};
        int[] inputArray2 = {1, 2, 4, 5};
        int[] inputArray3 = {1, 3, 7, 5};
        int[] inputArray4 = {15, 2, 3, 5, 7, 1, 6, 8, 9};

        ArrayProcessing filteredArr1 = new ArrayProcessing();
        ArrayProcessing filteredArr2 = new ArrayProcessing();
        ArrayProcessing filteredArr3 = new ArrayProcessing();
        ArrayProcessing filteredArr4 = new ArrayProcessing();
        ArrayProcessing filteredArr5 = new ArrayProcessing();

        int[] result1 = filteredArr1.uniqueNumbers(inputArray1);
        System.out.println("Task 1 result is: " + Arrays.toString(result1));

        int[] result2 = filteredArr2.uniqueNumbersFromTwoArrays(inputArray2, inputArray3);
        System.out.println("Task 2 result is: " + Arrays.toString(result2));

        int[] result3 = filteredArr3.nonUniqueNumbersFromTwoArrays(inputArray2, inputArray3);
        System.out.println("Task 3 result is: " + Arrays.toString(result3));

        int[] result4 = filteredArr4.reverseOrder(inputArray2);
        System.out.println("Task 4 result is: " + Arrays.toString(result4));

        int[] result5 = filteredArr5.sortEvenNumber(inputArray4);
        System.out.println("Task 5 result is: " + Arrays.toString(result5));
    }
}
