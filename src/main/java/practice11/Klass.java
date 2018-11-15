package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass  {
	
    public int num = 0;
    public Student leader;
    public Teacher teacher;
    public List<Student> students = new ArrayList<Student>();
    
    //constructor
    public Klass(int num) {
        this.num = num;
    }
    public int getNumber() {
        return this.num;
    }
    public String getDisplayName() {
        return "Class " + num;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void assignLeader(Student stu) {
    	
    	if(this.students.indexOf(stu) != -1) {
    		this.leader = stu;
    		if (this.teacher != null) 
                System.out.print("I am " + this.teacher.getName() + ". I know " + stu.getName()+ " become Leader of " + getDisplayName() + ".\n");

    	}
    	else
    		System.out.print("It is not one of us.\n");
    }
    public void appendMember(Student stu) {
    	this.students.add(stu);
    	if (this.teacher != null)
            System.out.print("I am " + this.teacher.getName() + ". I know " + stu.getName()+ " has joined " + getDisplayName() + ".\n");

    }
    public Student getLeader() {
    	if(this.leader != null)
    		return this.leader;
    	else
    		return new Student(0, null, 0, null);
    }
    
}
