import java.util.*;
class inputoutput
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    String name;
     System.out.println("Enter your name");
     name= in.nextLine();  //next() takes only single word // nextLine() takes full string including spaces..
     System.out.println(name);
}
}
