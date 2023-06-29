package java8.Java8Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;
}

public class StreamFilterMethod {
    public static void main(String[] args) {
        List<Product> products = getProducts();
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 1222) {
                list.add(product);
            }
        }
        list.forEach(s -> System.out.println(s));
        System.out.println("Using Stream API");
        // using stream api
//      List<Product> ans =  products.stream().filter(product->product.getPrice()>1222).collect(Collectors.toList());
//      ans.forEach(System.out::println);
        products.stream().filter(product -> product.getPrice() > 1222).forEach(System.out::println);
        System.out.println("Sorted List Using Compare");
        List<Product> sortedProduct = products.stream().sorted(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int p1 = o1.getPrice();
                int p2 = o2.getPrice();
                return p2-p1;
            }
        }).collect(Collectors.toList());
        sortedProduct.forEach(System.out::println);
        System.out.println("Sorting Using Lambda Expression");
        List<Product> sortedProductNew = products.stream().sorted((o1, o2)-> (int)(o1.getPrice() - o2.getPrice())).collect(Collectors.toList());
        sortedProductNew.forEach(System.out::println);
        System.out.println("Sorting Using Comparator");
        List<Product> sortedProductNewComparator = products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
        sortedProductNewComparator.forEach(System.out::println);
        System.out.println("Sorting Using Reversed");
        List<Product> sortedProductNewComparator2 = products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).collect(Collectors.toList());
        sortedProductNewComparator2.forEach(System.out::println);
    }


    private static List<Product> getProducts() {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "Shivam", 1222));
        productList.add(new Product(2, "Megha", 12345));
        productList.add(new Product(3, "Garima", 1222341));
        productList.add(new Product(4, "Atul", 12223412));
        productList.add(new Product(5, "Lambu", 0));
        return productList;
    }
}
