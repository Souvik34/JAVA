public class factorial 
{
 public static int fact(int n)
 {
    int f;
    if(n==0)
    {
        return 1 ;
    }

   int fn= fact(n-1);
    f=n * fact(n-1);
    return f;
    
 }
    public static void main(String args[])
    {
        int n=5;
       System.out.println(fact(n)); 

    }
    
}
