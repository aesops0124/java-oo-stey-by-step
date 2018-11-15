package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<practice10.Klass> klass_linkedList = new LinkedList<Klass>();
 
    Teacher(int id, String name, int age, LinkedList<practice10.Klass> klass_linkedList) { 
        super(id, name, age); 
        this.klass_linkedList = klass_linkedList;
    } 
    Teacher(int id, String name, int age) { 
        super(id, name, age); 
        this.klass_linkedList = klass_linkedList;
    } 
    
    public LinkedList<practice10.Klass> getClasses() {
    	return klass_linkedList;
    }
    public String introduce() {
    	if(!klass_linkedList.isEmpty()) {
    		String output = "";
    		int noOfClass = 0;
    		output += "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class ";
			for (int i=0; i<klass_linkedList.size(); i++) {
				if(noOfClass == 0) {
					output += klass_linkedList.get(i).getNumber() + "";
					noOfClass++;
				}
				else
					output += ", " + klass_linkedList.get(i).getNumber();
			}
    		output += ".";
    		return output;
    	}
    	else
    		return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        
    }
    public String introduceWith (Student stu) {
    	
    	if(this.klass_linkedList.contains(stu.getKlass()))
    		return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + stu.getName() + ".";
		else
			return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + stu.getName() + ".";
    }
    
    public boolean isTeaching (Student stu) {
    	return (this.klass_linkedList.contains(stu.getKlass()));
		
    }
}  
