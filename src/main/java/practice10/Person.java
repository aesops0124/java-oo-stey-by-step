package practice10;


public class Person {
	public String name = "";
    public int age = 0;
    public int id = 0;
    //constructor
    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getId() {
        return this.id;
    }
    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
    @Override
 	public boolean equals(Object person){
    	return (id==((Person)person).getId());
 	}
}
