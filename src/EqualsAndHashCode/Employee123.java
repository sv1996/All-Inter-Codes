package EqualsAndHashCode;

import java.util.Objects;

public class Employee123 {
    private String empName;
    private int empId;
    private String department;

    public String getEmpName() {
        return empName;
    }

    public Employee123(String empName, int empId, String department) {
        this.empName = empName;
        this.empId = empId;
        this.department = department;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getDepartment() {
        return department;
    }
// Overdding equals Methods

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee123 that = (Employee123) o;
//        return empId == that.empId && Objects.equals(empName, that.empName) && Objects.equals(department, that.department);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(empName, empId, department);
//    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee123)) {
            return false;
        }

        Employee123 other = (Employee123) obj;
        return empId == other.empId && Objects.equals(empName, other.empName) && Objects.equals(department, other.department);

    }

    // override Hashcode Method
    public int hashCode() {
        return Objects.hash(empId, empName, department);
    }


    public static void main(String[] args) {

    }
}
