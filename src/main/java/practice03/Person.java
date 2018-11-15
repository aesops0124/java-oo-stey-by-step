package practice03;

public class Person {
	public String name = "";
    public int age = 0;
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
