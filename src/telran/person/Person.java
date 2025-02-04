package telran.person;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		 return "Person{name='" + name + "', age=" + age + "}";
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("Tolya", 25);
		System.out.println(person1);
	}
	
}
