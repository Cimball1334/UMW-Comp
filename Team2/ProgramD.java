import java.util.Scanner;
public class ProgramD {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int backpack = userInput.nextInt();
		double biggest = 0;
		double smallest = 0;
		double sum = 0;
		boolean ifRun = false;
		for (int i = 0; i < backpack; i++) {
			double num = userInput.nextDouble();
			if (!ifRun) {
				smallest = num;
				biggest = num;
			}
			ifRun = true;
			sum += num;
			if (biggest < num)
				biggest = num;
			if (smallest > num)
				smallest = num;
		}
		double bigOutput = biggest * 10;
		double smallOutput = smallest * 10;
		double averageOutput = (sum/(backpack*1.0)) * 10;
		bigOutput = Math.round(bigOutput)/10.0;
		smallOutput = Math.round(smallOutput)/10.0;
		averageOutput = Math.round(averageOutput)/10.0;
		 System.out.println("Heaviest backpack: " + bigOutput);
		 System.out.println("Lightest backpack: " + smallOutput);
		 System.out.println("Average weight of all backpacks: " + averageOutput);
		
	}
}
