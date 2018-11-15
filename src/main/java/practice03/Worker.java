package practice03;

import practice03.Person;

public class Worker extends Person {
    private int klass;
 
    Worker(String name, int age) { 
        super(name, age); 
    } 

    public int getKlass() {return klass;}
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}  
