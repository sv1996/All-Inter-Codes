package Codes;


class Single {
  public  String name;
  public int age;

    public Single(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   Single()
    {
        System.out.println("Single Instance is Created");
    }
    public Single getObject(Single single)
    {

        return new Single();
    }



}


public class SigletonImpl {
    public static void main(String[] args) {
        Single single = new Single();
        Single s = single.getObject(single);
    }
}
