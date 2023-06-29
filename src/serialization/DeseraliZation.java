package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeseraliZation {
    public static void main(String[] args)  throws Exception{
        FileInputStream fi = new FileInputStream("shivam.txt");
        ObjectInputStream objectinput = new ObjectInputStream(fi);
       Student s = (Student) objectinput.readObject();
       // printing the data of the serialized Object
        System.out.println(s.name  + " ->" + s.id);
        objectinput.close();
        String str = new String();
    }



    /*

    Third largest element in an array of distinct elements
   Input: arr[] = {1, 14, 2, 16, 10, 20}
   Output: The third Largest element is 14

    int max = Integer.MIN_VALUE;
    int secondLargest  =-1;

    for(int i=0;i<arr.length;i++)
    {
    largest = Math.max(largest,arr[i]);
    }

       for(int i=0;i<arr.length;i++)
    {
    if(arr[i]! = largest)
    {

    }
    secondLargest = Math.max(secondLargest,arr[i]);
    }

     for(int i=0;i<arr.length;i++)
     {

       if(arr[i]! = largest && arr[i] != secondLargest)

    thirdLargest = Math.max(thirdLargest,arr[i]);
    }

    return thridLargest;
   */
}
