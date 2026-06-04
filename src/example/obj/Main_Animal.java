package example.obj;

public class Main_Animal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat();
		Animal a2 = new Cat();
		
		//Method overloading
		a.sound();
		a.sound("Generic");
		
		
		//Method overriding
		c.sound("soft");
		
		//Polymorphism
		 a2.sound("loud");

	}

}
