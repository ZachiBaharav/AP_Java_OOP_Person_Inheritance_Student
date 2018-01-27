
/*
Question as phrased in the book : "Big Java"

===
Implement a superclass Person. Make two classes, Student and Instructor, that
inherit from Person. 
  - A Person has a name and a year of birth. 
  - A student has a major.
  - An instructor has salary.
Write the class definitions, the constructors, and the methods toString for all classes.

===
Here is a more detailed explanation and specifications for the above:

Wtite (superclass) Person.
A Person has a name and a year of birth.

Write two subclasses of Person:
Student and Instrcutor

Student has a major. An instructor has a salary.

The classes should support the following:
Person:
    constructor:  Person(String name, int yearOfBirth)
    function toString() , that will print   name+" "+year

Student
    constructor: Student(String name, int yearOfBirth, String major)
    function toString(), prints  name+" "+year+" :: " + major
    -- use super.toString() in your Student method
Instructor
    constructor: Instructor(String name, int yearOfBirth, int salary)
    function toString(), prints  name+" "+year+" :: " + salary
    -- use super.toString() in your Instructor method


Below is a simple testing program. 
*/

public class Main {
    
    public static void main(String[] args)
    {
        Person p = new Person("John Smith",1970);
        Instructor i = new Instructor("Jane Doe",1968,3120);
        Student s = new Student("Joe Mow",1998,"Futureama");
        
        
        System.out.println("Person: "+p);
        System.out.println("Instructor: "+i);
        System.out.println("Student: "+s);
        
    }
}
