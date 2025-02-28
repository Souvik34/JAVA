import java.util.*;
class findchar
{

    public static void prinletters(String st)
    {
        for(int i=0;i<st.length();i++)
        {
            System.out.print(st.charAt(i)+ " ");
        }
    }
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    String name;
     System.out.println("Enter your name");
     name= in.nextLine();  
    //  System.out.println(name.charAt(4));
    prinletters(name);
}
}
