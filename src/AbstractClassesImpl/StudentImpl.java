package AbstractClassesImpl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String firstName;
    String lastName;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}


public class StudentImpl {
    public static <Hashmap> void main(String[] args) {
        List<Student> studentList = List.of(new Student("shivam", "Vishwa", 25), new Student("zayn", "gupta", 27), new Student("abhishek", "verms", 29),
                new Student("gopi", "VIHSWAKARMA",29));
Map<String, Integer > map = new HashMap<>();


//        studentList.stream()
//                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getAge).reversed()).collect(Collectors.toList())
//                .forEach(System.out::println);
         studentList.stream()
                .sorted(new Comparator<>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        String s1 = o1.getFirstName();
                        String s2 = o2.getFirstName();
                        return s1.compareTo(s2);
                    }
                }).collect(Collectors.toList()).forEach(System.out::println);
    }

 }
