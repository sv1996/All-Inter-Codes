package Codes;

import java.util.ArrayList;
import java.util.List;

public class SplitArrays {
    private static List<List<Integer>> splitArray(List<Integer> array, int splitSize) {
        /*
      	List<Integer>original = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]


        List<List<Integer>> list = splitArray(original, splitSize);

        System.out.print(list);
        //	list.forEach(list)
        //	list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));


        */

        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        int count =1;
         for(int i=0;i<array.size();i++) {
             smallList.add(array.get(i));
            if(count == splitSize)
         {
             finalList.add(smallList);
             count =0;
             smallList = new ArrayList<>();
         }
         }
        return finalList;
    }
    public static void main(String[] args) {
        List<Integer> original = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int splitSize = 3;
        List<List<Integer>> list = splitArray(original, splitSize);

        for (List<Integer> al:list) {
            System.out.println(al.toString());

        }

      //  System.out.print(list);
        //	list.forEach(list)
        //	list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

        /*expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]

        */
    }


}



