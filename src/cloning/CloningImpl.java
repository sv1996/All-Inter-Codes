package cloning;

class Original implements Cloneable {
    int x = 10;
    int age;
    String name;

    public Original(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CloningImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Original original = new Original(1, "Shivam");
        Original duplicate = original;
        duplicate.setAge(4);
        duplicate.setName("Rohan");
        System.out.println(original.getName());
        System.out.println(original.getAge());



    }
}
