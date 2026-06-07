package example.obj;

public class CovertString {

	public static void main(String[] args) {
		
		int n = 78;
		
		String str = String.valueOf(n);
		System.out.println(str);
		System.out.println(str.getClass().getSimpleName());
		
	if(str.equals("78")){
		
		System.out.println("Good job");
	}
	else
	{
		System.out.println("Wrong answer");
	}
		
	}

}
