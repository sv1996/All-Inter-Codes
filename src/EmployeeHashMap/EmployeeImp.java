package EmployeeHashMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class Employee {

    public int id;
    public String name;
    public String city;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name) && city.equals(employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}

public class EmployeeImp {
    public static void main(String[] args) {
        // if content of object is same then ex- id,name,city
        // then same hashcode will be generated
        // like below
        Employee e1 = new Employee(1, "ankit", "ggn");
        Employee e2 = new Employee(1, "ankit", "ggn");
        // comparison of Referece
        System.out.println("Comparison of Reference");
        System.out.println(e1 == e2); //false ..different reference
        //two objects created on different location

        // we have overridden .equals and hashcode methods
        System.out.println(Objects.hash(e1));  //  same hashcode
        System.out.println(Objects.hash(e2));   //  same hashcode
        // reference operator always meant for  reference comparison in memory
        System.out.println(e1.hashCode()); // same
        System.out.println(e2.hashCode()); //same
        System.out.println(e1 == e2); //false ..different reference
        //.equals() always refer for address comparison
        System.out.println(e1.equals(e2)); // true; // two different object
        System.out.println("After reference comparison");
        HashMap<Employee, String> map = new HashMap<>();
        // same hashcode for e1 and e2
        // so old value will be  assigned and map size
        // will be 1
        map.put(e1, "new");
        map.put(e2, "news");
        System.out.println("HahMap Size-: " + map.size());// 1

    }

}
