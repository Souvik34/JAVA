import java.util.*;
 class susbstr
{
    public static String subst(String str, int e, int l)
    {
        String substr="";
        for(int i=e;i<l;i++)
        {
            substr= substr+ str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String st= "HelloWorld";

        System.out.println(subst(st, 3, 6)); 
        // can use .substring function   
        // syntax: st.substring(e,l);
    }
}