package ImmutableStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



final class Immutable {
    // make all fields private and final
    private final String name;
    private final Integer studentId;
    private final List<String> subject;

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public List<String> getSubject() {
        return new ArrayList<>(subject);
        // return subject;
    }

    // deep copy constructor Initialization
    public Immutable(String name, Integer studentId, List<String> subject) {
        this.name = name;
        this.studentId = studentId;
        this.subject = subject;
    }
}

public class MainImpl {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<>();
        subList.add("Hindi");
        subList.add("English");
        subList.add("Korean");
        Immutable im = new Immutable("Shivam", 123, subList);
        System.out.println("Hash Value");
        System.out.println(Objects.hash(im));
        System.out.println(im.getName());
        System.out.println(im.getStudentId());
        System.out.println(im.getSubject());
        im.getSubject().add("NewSub");
        System.out.println(im.getSubject());
        System.out.println("Hash Value");
        System.out.println(Objects.hash(im));




    }
}
