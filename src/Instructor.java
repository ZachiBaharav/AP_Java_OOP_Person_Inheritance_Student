
public class Instructor extends Person {
    private int mySalary;
    
    public Instructor(String name, int dob, int salary){
        super(name, dob);
        mySalary = salary;
    }
    
    public String toString(){
        return super.toString()+" :: "+mySalary;
    }
}
