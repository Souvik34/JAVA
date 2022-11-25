import java.util.*;
class compare
{
public static void main(String args[])
{

    String name1= "tony";
    String name2= "tony";
    String name3= new String("tony");

    if(name1==name2)
    {
        System.out.println("Strings are equal");

    }

    else
    {
        System.out.println("Strings are not equal");
    }

    if(name1==name3)
    {
        System.out.println("Strings are equal");
    }
    else
    {
        System.out.println("Strings are not equal");
    }
    if(name1.equals(name3)) //.equals() checks value and in string "==" checks the object level
    {

        System.out.println("Strings are equal");
    }
    else
    {
        System.out.println("Strings are not equal");
    }
     
     
}
}
