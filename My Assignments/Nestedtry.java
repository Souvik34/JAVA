class Nestedtry
{
    public static void main(String args[])
    {
        int a[]= new int[5];
        try{
            a[1]= 34;
        

        try {
            int d =a[1]/0;
            
        } catch (Exception e) {
           
            System.out.println(e);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);

    }
    }
}