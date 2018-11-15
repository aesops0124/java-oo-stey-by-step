package practice06;


public class Teacher extends Person {
    private int klass;
 
    Teacher(String name, int age, int klass) { 
        super(name, age); 
        this.klass = klass;
    } 
    Teacher(String name, int age) { 
        super(name, age); 
        this.klass = 0;
    } 

    public int getKlass() {return klass;}
    public String introduce() {
    	if(klass > 0)
    		return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + klass + ".";
    	else
    		return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        
    }
}  
