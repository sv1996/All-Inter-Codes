package java8.Java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Logs

{
    private Integer pID;
    private List<String> logs;

    public Integer getpID() {
        return pID;
    }

    public Logs(Integer pID, List<String> logs) {
        this.pID = pID;
        this.logs = logs;
    }
    public Logs()
    {

    }

    public void setpID(Integer pID) {
        this.pID = pID;
    }

    public List<String> getLogs() {
        return logs;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }
}

public class GroupByProIDImpl {


    public static void main(String[] args) {
   String str = "167:START\n" +
           "272:START\n" +
           "347:START\n" +
           "490:START\n" +
           "167:LOG 1\n" +
           "16:START\n" +
           "272:LOG 1\n" +
           "347:LOG 1\n" +
           "16:LOG 1\n" +
           "490:LOG 1\n" +
           "347:LOG 2\n" +
           "167:LOG 2\n" +
           "347:LOG 3\n" +
           "16:LOG 2\n" +
           "272:LOG 2\n" +
           "167:LOG 3\n" +
           "490:LOG 2\n" +
           "16:LOG 3\n" +
           "347:LOG 4\n" +
           "490:LOG 3\n" +
           "272:LOG 3\n" +
           "490:LOG 4\n" +
           "167:LOG 4\n" +
           "167:LOG 5\n" +
           "347:LOG 5\n" +
           "16:LOG 4\n" +
           "272:LOG 4\n" +
           "167:LOG 6\n" +
           "490:LOG 5\n" +
           "272:LOG 5\n" +
           "347:END\n" +
           "16:LOG 5\n" +
           "272:LOG 6\n" +
           "490:END\n" +
           "16:LOG 6\n" +
           "167:END\n" +
           "16:LOG 7\n" +
           "272:LOG 7\n" +
           "272:END\n" +
           "16:END\n"
           ;


      List< HashMap<Integer , List<String> >> map  =  new ArrayList<>();
String [] strSplit = str.split("\n");
HashMap<String , List<String> > map1 = new HashMap<>();
List<Logs> logs = new ArrayList<>();
for(int i =0;i<strSplit.length;i++)
{

    System.out.println(strSplit[i]);



}

// comparator to sort PID and then Group by Pid

    }

    private static HashMap<Integer , String> getString(String s) {
       return null;


    }
}
