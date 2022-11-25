import java.util.*;
class concat
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    String name, name2, fullname;
     System.out.println("Enter your first name");
     name= in.nextLine();  
     
     System.out.println("Enter your surname");
     name2= in.nextLine(); 
     fullname= name+ " " + name2;

     System.out.println(fullname);
}
}
