package ArrayImpl;

public class MaxWaterStoreImpl {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = maxWaterStored(arr);
        System.out.println("Maximum Number Of Water Can be Stored->" + ans);
    }

    private static int maxWaterStored(int[] arr) {
        int n = arr.length;
        // get Max From left side
        // get max from Right Side
        int maximumAmountOfWater = 0;
        for (int i = 1; i < n - 1; i++) {
            // get Max From left side
            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            // get max from Right Side
            int rightMax = arr[i];
            for (int j = i+1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            maximumAmountOfWater += Math.min(leftMax, rightMax) - arr[i];
        }

        return maximumAmountOfWater;
    }
}
