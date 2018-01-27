
public class Student extends Person {
    
    private String myMajor;
    
    public Student(String name, int dob, String major){
        super(name, dob);
        myMajor = major;
    }
    
    public String toString(){
        return super.toString()+" :: "+myMajor;
    }
}
