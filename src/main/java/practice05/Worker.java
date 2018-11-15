package practice05;

public class Worker extends Person {
    private int klass;
 
    Worker(String name, int age) { 
        super(name, age); 
    } 

    public int getKlass() {return klass;}
    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a Worker. I have a job.";
    }
}  
