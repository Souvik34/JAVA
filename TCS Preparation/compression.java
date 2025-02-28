import java.util.*;

class compression

{

    public static String compress(String st)
    {
        String str="";

        for(int i=0;i<st.length();i++)
        {
            Integer count= 1;
            while(i<st.length()-1 && st.charAt(i)== st.charAt(i+1))
            {
                count++;
                i++;
            }
            str= str+ st.charAt(i);

            if(count>1)
            {
                str+= count.toString();
            }
        }
        return str;
    }
    public static void main(String args[])
    {
        String s="aaabbccccdd";

       System.out.println(compress(s));
    }
}