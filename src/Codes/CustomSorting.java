package Codes;

import java.util.Comparator;
import java.util.List;

class User
{
public  List<String > users;

    public User(List<String> users, String orderString) {
        this.users = users;
        this.orderString = orderString;
    }

    public User() {

    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public String getOrderString() {
        return orderString;
    }

    public void setOrderString(String orderString) {
        this.orderString = orderString;
    }

    public String orderString;
}


class MyCustomComparator implements Comparator <Object>{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}




public class CustomSorting {
    public static void main(String[] args) {
        List<String> list=List.of("peter", "john" ,"deepak","shivam");
        String orderString = "dpsg";
//        User user = new User();
//        user.setUsers(list);
//        user.setOrderString(orderString);
//        Collections.sort(list, new MyCustomComparator());
//        list.forEach(l-> System.out.println(l));

        int number = 75346;
        int ans = reverseNumber(number);
        System.out.println(ans);
    }

    private static int reverseNumber(int number) {
        int ans =0;
        while (number >0)
        {
            int mod = number %10;
             ans = mod + ans *10;
             number = number /10;
        }
        return  ans;
    }
}
