

public class Person {

    private String myName;
    private int myDob;
    
    public Person(String name, int dob){
        myName = name;
        myDob = dob;
    }
    
    
    public String toString(){
        return myName+" "+myDob;
    }
    
}
