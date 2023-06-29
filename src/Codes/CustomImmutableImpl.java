package Codes;

import java.util.ArrayList;
import java.util.List;
final class Student
 {
  private final int id;
  private String name;
  private final List<String> subject;

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

//     public Student() {
//     }

     public Student(int id, String name, List<String> subject) {
         this.id = id;
         this.name = name;
         this.subject = subject;
     }
     public List<String> getSubject() {
         return new ArrayList<>(subject);
     }
 }

public class CustomImmutableImpl {
    public static void main(String[] args) {
        List<String> sub = new ArrayList<>();
        sub.add("english");
        sub.add("Programaing");
        Student student = new Student(1,"shivam", sub);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSubject());
        student.getSubject().add("Maths");
        System.out.println(student.getSubject());
    }
}
