public class sum 
{

    public static int  add(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int p= add(n-1);
        int s=n+p;

        return s;
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println(add(n));

    }
    
}
