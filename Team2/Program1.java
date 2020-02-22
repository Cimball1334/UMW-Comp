import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int lines = userInput.nextInt()*2;
		int sum[] = new int[lines/2];
		for (int i = 0; i < lines; i++)
			sum[i/2]+= userInput.nextInt(); 
		for (int i = 0; i < lines/2; i++)
			System.out.println(sum[i]);
	}
}
