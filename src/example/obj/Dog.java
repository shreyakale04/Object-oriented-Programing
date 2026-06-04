package example.obj;

public class Dog {

	String name;
	
	void bark(){
		System.out.println(name + " Says Woof! ");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.name = "Rockey";
		d.bark();
		

	}

}
