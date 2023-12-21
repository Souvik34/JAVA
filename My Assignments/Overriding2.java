class Vehicle
{
    void ride()
    {
        System.out.println("This is vehicle");
    }
}

class Bike extends Vehicle
{ 
    @Override
    void ride()
    {
        System.out.println("This is Bike");
    }
}

/**
 * Overriding2
 */
public class Overriding2 {
 
  public static void main(String args[])
  {

  
    Bike obj = new Bike();
    obj.ride();
}
}