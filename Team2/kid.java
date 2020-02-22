import java.util.Scanner;

public class kid {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		int d = input.nextInt();
		
		
		for(int i = 0; i < d; i++)
		{
			int speed = input.nextInt();
			int miles = input.nextInt();
			System.out.print("Jaffy can bike the trail in ");
			
			if(speed > miles)
			{
				System.out.print("0 hours, ");
			}else {
				System.out.print((miles/speed) + " hours,");
			}
			if(miles < speed)
			{
				double calc = miles/speed;
				System.out.print((calc * 60) + "minutes,");
			}
				else {
				System.out.print("0 minutes,");
				}
				
				
				}
			System.out.print("0 seconds.");
		}
		
}
	

