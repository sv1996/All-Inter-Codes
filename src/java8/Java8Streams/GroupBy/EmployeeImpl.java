package java8.Java8Streams.GroupBy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Staff {

    private String name;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;


}


class Customer {
    private Long id;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    private String name;
    private Integer tier;
}

class Order {
    private Long id;
    private LocalDate orderDate;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                '}';
    }

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
    }

    private LocalDate deliveryDate;
    private String status;
    private Customer customer;

}

class Product {
    private Long id;

    private String name;
    private String category;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public Product(Long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;

    }

}

class Employee {
    public String name;
    public int age;
    public String JobTitle;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", JobTitle='" + JobTitle + '\'' +
                '}';
    }

    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        JobTitle = jobTitle;
    }
}


public class EmployeeImpl {


    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee("rohan", 10, "developr"),
                new Employee("shivam", 20, "developr"),
                new Employee("neelam", 20, "analyst"),
                new Employee("shreya", 30, "analyst"),
                new Employee("Garima", 30, "law"),
                new Employee("Mahima", 31, "law")
        );
        System.out.println(employeeList);
        // groupBy JobID
        // or groupBuy Age
        Map<Integer, List<Employee>> ans = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(ans);


        /////////////////////////////////////////////////////////////////////////////////////
        List<Product> productsList = List.of(new Product(101L, "RDsHARMA", "Books"),
                new Product(102L, "Maths", "Books"),
                new Product(103L, "Science", "Books"),
                new Product(104L, "Nagraj", "Comics"),
                new Product(105L, "Shibu", "Comics"));
        // Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
        List<Product> result = productsList.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p->p.getId()>100l)
                .collect(Collectors.toList());
        System.out.println(result);

      //  Exercise 3 — Obtain a list of product with category = “Books” and then apply 10% discount on id

//        List<Product> productsResult = productsList.stream()
//                .filter(p->p.getCategory().equalsIgnoreCase("Books"))
//                .map(p -> p.getId() * 0.9)
//                .collect(Collectors.toList());
//
        // Exercise 5 — Get the cheapest products of “Books” category
//        Optional<Product> result = productRepo.findAll()
//                .stream()
//                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .findFirst();

        //or


//        Optional<Product> result = productRepo.findAll()
//                .stream()
//                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
//                .min(Comparator.comparing(Product::getPrice));
        // Exercise 6 — Get the 3 most recent placed order
//        List<Order> result = orderRepo.findAll()
//                .stream()
//                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
//                .limit(3)
//                .collect(Collectors.toList());


//   Exercise 11 — Obtain a data map with order id and order’s product count
      //  Collectors.toMap() accepts two arguments for your specify the key and value respectively.
//        Map<Long, Integer>  result = orderRepo.findAll()
//                .stream()
//                .collect(
//                        Collectors.toMap(
//                                order -> order.getId(),
//                                order -> order.getProducts().size()
//                        )
//                );

// Exercise 12 — Produce a data map with order records grouped by customer
//        Map<Customer, List<Order>> result = orderRepo.findAll()
//                .stream()
//                .collect(
//                        Collectors.groupingBy(Order::getCustomer)
//                );

//        Map<Customer, List<Order>> result = orderRepo.findAll()
//                .stream()
//                .collect(
//                        Collectors.groupingBy(Order::getCustomer)
//                );

        // Exercise 14 — Obtain a data map with list of product name by category

//        Collectors.groupingBy(Product::getCategory),
//                then the output will be Map<Category, List of Products> but the expected
//        output should be Map<Category, List of Product Name>. You can use Collectors.mapping()
//        to convert product objects to product names for the data map construction.

//        Map<String, List<String>> result = productRepo.findAll()
//                .stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Product::getCategory,
//                                Collectors.mapping(product -> product.getName(), Collectors.toList()))
//                );


        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30),
                new Staff("jack", 27 ),
                new Staff("lawrence", 33)
        );


       // 2. List of objects -> List of String
      //  2.1 Get all the name values from a list of the staff objects.
        List<String> staffName = staff.stream()
                .map(s->s.getName())
                .collect(Collectors.toList());
        System.out.println(staffName);

    }

}
