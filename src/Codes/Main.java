package Codes;
import java.util.*;

public class Main {
    /******************************************************************************
     Welcome to GDB Online.
     Code, Compile, Run and Debug online from anywhere in world.
     *******************************************************************************/
/*

import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception{
	    Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
	}

	public static Integer[] flatten(Object[] inputArray) throws Exception {
  Integer[] flattenedArrayAns = Arrays.stream(inputArray).flatMap(o->stream.of(o)).collect(Integer[]::new);
  return flattenedArrayAns;



	}

}


 */

        public static void main(String[] args) {
            int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

            List<int[]> list = splitArray(original, splitSize);
            list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
        }

        public static List<int[]> splitArray(int[] array, int splitSize) {
            // split into 3 size;
            List<int[]> finalList = new ArrayList<>();
            //  List<Integer> smalList = new ArrayList<>();
            int [] smalList = new int [splitSize];


            int count =0;
        //    int k=0;

            for(int i=0;i<array.length;i++)
            {
                if(count <splitSize)
                {
                    smalList[count] =array[i];
                 //   k++;
                    count++;
                }
                else
                {

                    finalList.add(smalList);
                    count =0;
                 //   k=0;
                }






            }

            return finalList;






        }
    }




