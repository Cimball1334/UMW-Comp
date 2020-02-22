import java.util.Scanner;

public class jessie {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int h = 36;
		
		int total = h + (n*6);
		
		if(total % 12 ==0) {
			if(total / 12 > 19)
			{
			System.out.println("Jessie's height is " + (total / 12) + " feet!");	
			}else {
				System.out.println("Jessie's height is " + (total / 12) + " feet.");	
			}
			
		}else {
		
			
			if(total / 12 > 18)
			{
			System.out.println("Jessie's height is " + (total/12) + " and 1 half feet!");
			}else {
				System.out.println("Jessie's height is " + (total/12) + " and 1 half feet.");
			}
		}
		
		}
		
	}

