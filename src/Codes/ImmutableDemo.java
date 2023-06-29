package Codes;


import java.util.Date;

final class Employee {

    private final String name;
    private final Date doj;
    private final int empId;


    public Employee(String name, Date doj, int empId) {
        this.name = name;
        this.doj = new Date(doj.getTime());
        this.empId = empId;
    }


    // we only provide getter not setters
    public String getName() {
        return name;
    }

    public Date getDoj() {
        return new Date(doj.getTime());
    }

    public int getEmpId() {
        return empId;
    }
}


public class ImmutableDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("shivam", new Date(), 1);
        System.out.println(e1.getDoj());
        System.out.println(e1.hashCode());
        e1.getDoj().setDate(2);
        System.out.println(e1.getDoj());
        System.out.println(e1.hashCode());
        Employee e2 = new Employee("Rohan" , new Date(),2);
    }
}
