package example.obj;

public class Counter {
	
	private int value;
	
	public void increment(){
		
		value++;
	}
	public int getValue()
	{
	return value;

	}
	public static void main(String[] args) {
		
		Counter c = new Counter();
		System.out.println("Initial value : " + c.getValue());
		
		c.increment();
		c.increment();
		c.increment();
		
		System.out.println("Current value : " + c.getValue());
	}
}
