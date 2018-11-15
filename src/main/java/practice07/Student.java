package practice07;

public class Student extends Person {
    private Klass klass;
 
    Student(String name, int age, Klass klass) { 
        super(name, age); 
        this.klass = klass; 
    } 

    public Klass getKlass() {return klass;}
    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}  
