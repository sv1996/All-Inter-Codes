package Codes;

import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        /*
     Given an integer array nums, return all the triplets
      [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
      and nums[i] + nums[j] + nums[k] == 0.
      targetsum =
      nums[m] + nums[k] =0
      nums[m] + nums[k] = target
      nums[m] = target-nums[k];
       nums = [-1,0,1,2,-1,-4]
[[-1,-1,2],[-1,0,1]]
//nums = [-1,0,1,2,-1,-4]
//[[-1,-1,2],[-1,0,1]]
*/

        int nums[] = {-1, 0, 1, 2, -1, -4};
        int sum = 0;
        List<List<Integer>> ans = tripletSumBetter(nums, sum);
        System.out.println(ans);
//        for (List<Integer> an : ans) {
//            System.out.println(an);
//        }

        //nums = [-1,0,1,2,-1,-4]
//[[-1,-1,2],[-1,0,1]]
    }

    private static List<List<Integer>> tripletSumBetter(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        List<Integer> subList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
           ans.add(Arrays.asList(nums[i], nums[j],nums[k]));
                   // ans.add(subList);
                    j++;
                    k--;
                }

                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return new ArrayList<>(ans);
    }

    private static List<List<Integer>> tripletSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {


                int sum = nums[i] + nums[j];
                int key = target - sum;
                if (set.contains(key)) {
                    subList.add(nums[i]);
                    subList.add(nums[j]);
                    subList.add(key);
                    // ans.add(subList);

                } else {
                    set.add(nums[j]);
                }

            }
            ans.add(subList);

        }
        return ans;
    }
}
