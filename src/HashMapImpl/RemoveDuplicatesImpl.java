package HashMapImpl;

import java.util.LinkedHashSet;

public class RemoveDuplicatesImpl {
    public static void main(String[] args) {
       int [] nums = {0,0,1,1,1,2,2,3,3,4};
       int ans = remove_Duplicate_From_Array(nums);
        System.out.println(ans);

    }

    private static int remove_Duplicate_From_Array(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);

        }
        return set.size();
    }
}
