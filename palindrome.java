import java.util.*;
class palindrome

{

    public static boolean isPalindrome(String st)
    {
        for(int i=0;i<st.length()/2;i++)
        {
            int n= st.length();
            if(st.charAt(i)!= st.charAt(n-1-i))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String st;
        System.out.println("Enter the String");

        st= in.nextLine();

       System.out.println(isPalindrome(st)); 

    }
}