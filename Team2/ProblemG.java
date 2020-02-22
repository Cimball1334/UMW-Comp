import java.util.Scanner;
public class ProblemG {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		char[][] input = new char[10][10];
		int angle = userInput.nextInt();
		userInput.nextLine();
		for (int i = 0; i < 10; i++) {
				
			String a = userInput.nextLine();
			for (int j = 0; j < 10; j++)
				input[i][j] = a.charAt(j*2);
		}
		for (int i = 0; i < angle/90; i++)
			input = rotate(input);
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				if (j != 9)
				System.out.print(input[i][j] + " ");
				else 
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}
	public static char[][] rotate(char[][] c){
		char[][] b = new char[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				b[i][j] = c[j][9-i];
			}
		return b;
	}
	
}
/*
# # # # # # # # # # 
# # # # # # # # $ # 
# # $ # # # # # $ # 
# $ # $ # # $ $ $ # 
$ # $ # $ $ # # $ # 
# $ # $ # # $ $ $ # 
# # $ # # # # # $ # 
# # # # # # # # $ # 
# # # # # # # # # #
# # # # # # # # # #




*/