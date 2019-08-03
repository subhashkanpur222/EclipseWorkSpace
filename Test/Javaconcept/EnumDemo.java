package Javaconcept;

public class EnumDemo {
enum Status
{
	EASY, MEDIUM, HARD
}
	public static void main(String[] args) {
		/*Status statuArray[] = Status.values();
		for(Status st:statuArray)
			System.out.println(st);*/
		
		Status label = Status.EASY;
		
		switch(label)
		{
		case HARD:
			System.out.println("Problem is Hard");
			break;			
		case MEDIUM:
			System.out.println("Problem is MEDIUM");
			break;
		case EASY:
			System.out.println("Problem is EASY");
			break;
			
		default:
			System.out.println("Problem is not defined");
		}
	}
}
