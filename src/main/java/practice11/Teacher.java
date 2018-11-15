package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klass_linkedList = new LinkedList<Klass>();
 
    Teacher(int id, String name, int age, LinkedList<Klass> klass_linkedList) { 
        super(id, name, age); 
        for (Klass klass : klass_linkedList) {
            this.klass_linkedList.add(klass);
            klass.teacher = this;
        }
        
    } 
    Teacher(int id, String name, int age) { 
        super(id, name, age); 
    } 


    public LinkedList<Klass> getClasses() {
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

    
    /*public void notified (Student stu) {
    	if (!stu.getKlass().getLeader().equals(stu)) 
    		System.out.print("I am " + this.name + ". I know " + stu.getName() + " has joined Class " + stu.getKlass().getNumber() + ".");
    	else
    		System.out.print("I am " + this.name + ". I know " + stu.getName() + " become Leader of Class " + stu.getKlass().getNumber() + ".");
    }*/
}  
