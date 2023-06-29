package java8.Java8Streams;
// complexity of first approach
// O(nlogn)

// optimize one
/// largest 0(n)
// second largest 0(n)

// second highest marks [100 , 99]
// user_ID, marks

//Select user_ID, marks from User
//select user_ID, marks, Max(marks) from User where marks < select max(marks) from User;
//Select user_ID, marks from User where  Max(marks) from User where marks < select max(marks) from User;
//select Max(marks) from User where marks < select max(marks) from User;
//
//t.start()
//
//        t.start()





final class UserStudent
{
    private   String firstName;
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "UserStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    private final String lastName;
    private final String mobileNumber;

    // Constructor

    public UserStudent(String firstName, String lastName, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    // only getter method


}

public class Test {
    public static void main(String[] args) {

        UserStudent shivam = new UserStudent("Vishwakarma" , "Vish" , "8989");








    }













}
