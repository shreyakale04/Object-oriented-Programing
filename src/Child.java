
public class Child extends Parent{
	
	public static void display() { 
		System.out.println("Child Static"); 
		}

	public static void main(String[] args) { 
		Parent obj = new Child(); 
		Child obj1 = new Child();
		obj.display();
		obj1.display();
	}

}
