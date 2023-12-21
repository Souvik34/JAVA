class Employee
{
    private String name;
    private int id;

    public void setName(String n)
    {
        this.name= n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int roll)
    {
        this.id= roll;
    }
    public int getId()
    {
        return id;
    }


}

class Encapsulation
{
    
    public static void main(String[] args) {
        Employee sam = new Employee();
        // sam.name="Souvik";
        // sam.id=21;              // errors due to private access modifier in java
        

        sam.setName("Souvik");
        sam.setId(63);

        System.out.println(sam.getName());
        System.out.println(sam.getId());
    }
}