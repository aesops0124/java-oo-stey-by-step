package practice03;

import practice02.Person;

public class Student extends Person {
    private int klass;
 
    Student(String name, int age, int klass) { 
        super(name, age); 
        this.klass = klass; 
    } 

    public int getKlass() {return klass;}
    public String introduce() {
        return "I am a Student. I am at Class " + klass + ".";
    }
}  
