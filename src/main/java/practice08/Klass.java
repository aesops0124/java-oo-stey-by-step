package practice08;

public class Klass {
	
    public int num = 0;
    public Student leader; 
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
    public void assignLeader(Student stu) {
    	this.leader = stu;
    }
    public Student getLeader() {
        return this.leader;
    }
}
