package practice07;

public class Klass {
	
    public int num = 0;
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
}
