package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    public int id;
   public String name;

   Student(int id, String name)
   {
       this.id = id;
       this.name = name;
   }
   Student()
   {

    }
}
public class SerializationDemo  {
    public static void main(String[] args) throws Exception
    {

    Student student = new Student(123, "Shivam Vishwakarma");
        FileOutputStream fos = new FileOutputStream("shivam.txt");

        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(student);
        out.flush();
        //closing the stream
        out.close();
        System.out.println("success");

    }
}
