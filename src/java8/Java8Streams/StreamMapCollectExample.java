package java8.Java8Streams;

import java.util.ArrayList;
import java.util.List;

class UserDTO
{
    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int id;
    private String email;

    public UserDTO(int id, String email, String userName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
    }

    //  private String password;
    private String userName;
}
class User {
    private int id;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    private String userName;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Shivam","Coder","vishwakshivam@gmail.com"));
        userList.add(new User(2,"Garima","Lawyer","shivam24896@gmail.com"));
        userList.add(new User(3,"Shweta","Chemist","shivamBackup@gmail.com"));
        userList.add(new User(4,"Leena","Physics","shivamBackup123@gmail.com"));
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for(User user : userList)
        {
            userDTOList.add(new UserDTO(user.getId(), user.getEmail(),user.getPassword()));
        }

        userDTOList.forEach(userDTO -> System.out.println(userDTO));

//Using Stream method
        System.out.println("Using Stream method");
        userList.stream().map((User user) ->
             new UserDTO(user.getId(),user.getUserName(),user.getEmail())).forEach(userDTO -> System.out.println(userDTO));



    }
}
