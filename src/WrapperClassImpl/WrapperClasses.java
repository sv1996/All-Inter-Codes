package WrapperClassImpl;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5};
        Integer ans = addNumber(i);
        System.out.println(ans);

    }

    private static Integer addNumber(Integer[] arr) {
        Integer ans = 0;

        for (int i = 0; i <arr.length ; i++) {
            ans += arr[i];
        }

 return ans;
    }

}
