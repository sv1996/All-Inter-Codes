package Codes;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int sum = 3;
        int ans = subArrayEqualSumTok(nums, sum);
        System.out.println(ans);
    }


    private static int subArrayEqualSumTok(int[] nums, int k) {
        // find all SubArray
       int count=0;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = i; j < nums.length; j++) {
                 sum +=nums[j];
                 if(sum ==k)
                 {
                     count++;
                 }

            }
        }
return count;
    }
}
