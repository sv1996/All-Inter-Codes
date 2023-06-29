package AbstractClassesImpl;

import java.util.Stack;

class Weather {
    String place;
    Double temperature;

    public Weather(String place, Double temperature) {
        this.place = place;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "place='" + place + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}


public class WeatherImpl {

    public static void main(String[] args) {
        String str = "[(,)]";
        System.out.println(System.identityHashCode(str));
        boolean checkBalanced = checkBalancedParenthesis(str);
        String ans = checkBalanced ? "Balanced" : "Not balanced";
        System.out.println(ans);

        System.out.println("Getting Square of Number");
        int arr[] = {-4,-1,0,3,10};
        int ansArr[] = SquareOfNumberImpl(arr);
        for (int i = 0; i < ansArr.length; i++) {
            System.out.print(ansArr[i] + "->");
        }

        System.out.println("Reverse String");
    }

    private static int[] SquareOfNumberImpl(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int squireArray[] = new int[arr.length];
        int k = arr.length-1;
        while (startIndex <= endIndex) {
            int startNum = arr[startIndex] * arr[startIndex];
            int endNum = arr[endIndex] * arr[endIndex];
            if (startNum < endNum) {
                squireArray[k] = endNum;
                k--;
                endIndex--;
            } else {
                squireArray[k] = startNum;
                k--;
                startIndex++;

            }
        }

        return squireArray;

    }

    private static boolean checkBalancedParenthesis(String str) {
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
            } else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (!checkMatchPair(stack.pop(), ch[i])) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean checkMatchPair(Character pop, char ch) {
        if ((pop == '(' || pop == '[' || pop == '{') && (ch == ')' || ch == ']' || ch == '}')) {
            return true;
        }
        return false;
    }
}
