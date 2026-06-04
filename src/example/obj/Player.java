package example.obj;

public class Player {

	String name;
	int score;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getScore(){
		return score;
	}
	public void setScore(int score){
		this.score = score;
	}
	public static void main(String[] args) {
		
		Player p = new Player();
		p.setName("Rahul");
		p.setScore(60);
		
		System.out.println("Name of student : " + p.getName());
        System.out.println("Score : " + p.getScore());
	}

}
