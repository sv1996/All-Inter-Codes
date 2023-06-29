package java8.Java8Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    private String subject;
    private String name;
    private String surname;
    private String city;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Student(String subject, String name, String surname, String city, int age) {
        this.subject = subject;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

}



public class GroupByImpl {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20));

       Map<String , List<Student>> studentGroupBySubject = studentList.stream()
               .collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(studentGroupBySubject);
        System.out.println("Student group by City");
        Map<String , List<String>> studentGroupByCity = studentList.stream()
                .collect(Collectors.groupingBy
                        (Student :: getCity, Collectors.mapping(Student:: getName, Collectors.toList())));
        System.out.println(studentGroupByCity);




    }
}
