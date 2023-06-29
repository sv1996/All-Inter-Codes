package HashMapImpl;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementImpl {
    public static void main(String[] args) {
       int []  nums = {2,2,1,1,1,2,2};
       int ans = majorityElement(nums);
        System.out.println(ans);
    }

    private static int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i] ,1);
            }
        }
        int size =nums.length /2;
        int ans=Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            if(m.getValue() > size)
            {
              ans = m.getKey();
              break;
            }
        }
        return ans;
    }
}
