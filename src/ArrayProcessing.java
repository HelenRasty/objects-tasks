import java.util.Arrays;

public class ArrayProcessing {
    private boolean isElementInArray(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public int[] uniqueNumbers(int[] arr) {
        int[] filteredArr = new int[arr.length];
        int j = 0;

        for (int i : arr) {
            if (!isElementInArray(filteredArr, i)) {
                filteredArr[j] = i;
                j++;
            }
        }
        return Arrays.copyOf(filteredArr, j);
    }

    public int[] uniqueNumbersFromTwoArrays(int[] arr1, int[] arr2) {
        int[] filteredArr = new int[arr1.length + arr2.length];
        int j = 0;

        for (int i : arr1) {
            if (!isElementInArray(arr2, i)) {
                filteredArr[j] = i;
                j++;
            }
        }

        for (int i : arr2) {
            if (!isElementInArray(arr1, i)) {
                filteredArr[j] = i;
                j++;
            }
        }

        int[] newArray = Arrays.copyOf(filteredArr, j);
        Arrays.sort(newArray);
        return newArray;
    }

    public int[] nonUniqueNumbersFromTwoArrays(int[] arr1, int[] arr2) {
        int[] filteredArr = new int[arr1.length];
        int j = 0;
        for (int i : arr1) {
            if (isElementInArray(arr2, i)) {
                filteredArr[j] = i;
                j++;
            }
        }

        int[] newArray = Arrays.copyOf(filteredArr, j);
        Arrays.sort(newArray);
        return newArray;
    }

    public int[] reverseOrder(int[] arr) {
        int j = arr.length - 1;
        int[] revertedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revertedArr[i] = arr[j];
            j--;
        }
        return revertedArr;
    }

    public int[] sortEvenNumber(int[] arr) {
        int j = 0;
        int k = 0;
        int[] evenNumbersArr1 = new int[(arr.length / 2) + 1];
        int[] sortedArr = new int[arr.length];

            for (int i = 0; i < arr.length; i = i + 2) {
                evenNumbersArr1[j] = arr[i];
                j++;
            }
            int[] newArray = Arrays.copyOf(evenNumbersArr1, j);
            Arrays.sort(newArray);

            for (int i = 0; i < arr.length; i = i + 2) {
                sortedArr[i] = newArray[k];
                k++;
            }

            for (int i = 1; i < arr.length; i = i + 2) {
                sortedArr[i] = arr[i];
            }

        return sortedArr;
    }

}