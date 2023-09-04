
/**
 * This is a Unit Class to store some info about the units offered this term
 *
 * @author (Thair)
 * @version (04/09//2023)
 */
public class Unit
{
    // Attributes or instance var.
    private int id;
    private double[] marks;
    private String name;
    //Constructor 1
    public Unit(){
    }
    //Constructor 2
    public Unit(int uId, String uName){
        this.id = uId;
        this.name = uName;
        marks = new double[3];
        marks[0] = 55;
        marks[1] = 66;
        marks[2] = 77;
        //double[] marks  = {30,40,50};
    }
    //Getter method to get the unit id
    public int getId(){
        return this.id;
    }
    //Getter method to get the unit name
    public String getName(){
        return this.name;
    }
    //Setter method to set the unit id
    public void setId(int uId){
        this.id = uId;
    }
    //Setter method to set the unit name
    public void setName(String StName){
        this.name = StName;
    }
    
    public static void main(String[] args){
        //Create 1st object 
        Unit unit1 = new Unit();
        unit1.setId(123);
        unit1.setName("Jave 2");
        System.out.println("Unit1 Id: "+unit1.getId());
        System.out.println("Unit1 Name: "+unit1.getName());
        //Create the 2nd object
        Unit unit2 = new Unit(258,"Python");
        System.out.println("Unit1 Id: "+unit2.getId());
        System.out.println("Unit1 Name: "+unit2.getName());
    }
        
}
