package example.obj;

public class Cat extends Animal{

	@Override
	void sound(String type){
		 System.out.println("Cat meow is: " + type);
	}
}
