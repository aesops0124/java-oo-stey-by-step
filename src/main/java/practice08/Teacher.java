package practice08;


public class Teacher extends Person {
    private Klass klass;
 
    Teacher(int id, String name, int age, Klass klass) { 
        super(id, name, age); 
        this.klass = klass;
    } 
    Teacher(int id, String name, int age) { 
        super(id, name, age); 
        this.klass = null;
    } 

    public Klass getKlass() {return klass;}
    public String introduce() {
    	if(klass != null)
    		return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
    	else
    		return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        
    }
    public String introduceWith (Student stu) {
    	
    	if(this.klass.getNumber() == stu.getKlass().getNumber())
    		return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + stu.getName() + ".";
		else
			return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + stu.getName() + ".";
    }
}  
