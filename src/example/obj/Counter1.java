package example.obj;

public class Counter1 {

private int count;

public Counter1()
{
	
	count = 0;
}
	
public void increment()
    {
		
		count++;
	}
	public int getValue()
	{
	return count;

	}
	public static void main(String[] args) {
		
		  Counter1 headCount = new Counter1();
	      Counter1 tailCount = new Counter1();
	      
	      for (int flip = 0; flip < 100; flip++){
	    	  if(Math.random()<0.5){
	    		  headCount.increment();  
	    	  }else{
	    		  tailCount.increment(); 
	    	  }
	      }
	      System.out.println("Heads:  " + headCount.getValue());
	      System.out.println("Tails:  " + tailCount.getValue());
	}
}
