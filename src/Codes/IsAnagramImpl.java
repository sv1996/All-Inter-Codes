package Codes;

import java.util.Arrays;

public class IsAnagramImpl {
    public static void main(String[] args) {
        String a  = "anagram";
        String b = "margana";
      boolean ans =  isAnagram(a,b);
      if(ans)
      {
          System.out.println("Anagrams\n");
      }
    }

    private static boolean isAnagram(String a, String b) {

        int l1 = a.length();
        int l2 = b.length();
        if(l1!=l2)
        {
            return false;
        }
        char ch1 [] = a.toCharArray();
        char ch2 [] = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < l1; i++) {
            if(ch1[i] != ch2[i])
            {
                return false;
            }

        }
        return true;
    }


    // check even or odd


//
//    EvenOddCheck checkEvenOrOdd  = (n) -> {
//        if(n %2 ==0)
//        {
//            System.out.println("EVEN");
//        } else
//
//        {
//            System.out.println("ODD");
//
//        }
//    }
//    checkEvenOrOdd.check(num);
//     interface EvenOddCheck{
//         void check(int n);
//     }

/*
PrimeCheck checkPrime =(n) -> {
boolean isPrime  = true;
if(n<=1)
{
isPrime = false;
}
else

{
for(int i=2;i<=Math.sqrt(n); i++)

{
if(n %i ==0)
{
isPrime = false;
break;

}
}
}

if(isPrime)
{
            System.out.println("PRIME");

} else

{

            System.out.println("NOT PRIME");

}
PalindromeChecker checkPalindrome = (n) ->
{
int originalNumber  =n
int reerseNumber =0;
while(n!= 0)
{
int reminder  = n%10;
reverseNumber = reverseNumber *10 + reminder;
n = n/10;


}

if(reverseNumber == originalNumber)

{
            System.out.println("PALINDROME");

}else
{
            System.out.println("NOT PALINDROME");

}




//
CheckComposite composite = (n) ->
{
boolean isComposite  = false;
if(n>1)
{
for(int i=2;i<=Math.sqrt(n); i++)

{
if(n %i ==0)
{

isComposite = true;
break;
}
}

}
if(isComposite)
{

  System.out.println("COMPOSITE");
}
else

{

System.out.println("NOT COMPOSITE");
}

checkCompiste.check(num);

}

interface CheckComposite{
void check(int n);
}
checkPalindrome.chech(num);

interface PalindromeCheck
{
void check(int n)
}



 */
}
