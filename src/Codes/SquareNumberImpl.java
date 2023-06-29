package Codes;

public class SquareNumberImpl {
    public static void main(String[] args) {
        int arr[] = {-5, -4, -3, -1, 0, 2, 3, 4, 5};
        //  Input: [-5, -4, -3, -1, 0, 2, 3, 4, 5]
        //   Output: [0, 1, 4, 9, 9, 16, 16, 25, 25]
        int[] arr1 = squareSortedNumber(arr);
        for (int a = 0; a < arr1.length; a++) {
            System.out.print(arr1[a] + " ");
        }
    }

    private static int[] squareSortedNumber(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int sqrArray[] = new int[arr.length];
        int k = arr.length - 1;
        while (startIndex <= endIndex) {
            int startNum = arr[startIndex] * arr[startIndex];
            int endNum = arr[endIndex] * arr[endIndex];
            if (startNum < endNum) {
                sqrArray[k] = endNum;
                k--;
                endIndex--;
            } else {
                sqrArray[k] = startNum;
                k--;
                startIndex++;
            }
        }
        return sqrArray;
    }
}
