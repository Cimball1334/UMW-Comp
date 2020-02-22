import java.util.ArrayList;
import java.util.Scanner;

public class programI {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int times = input.nextInt();
		ArrayList<Integer> key = new ArrayList<Integer>(times);
		ArrayList<String> codes = new ArrayList<String>(times);
		String out = new String("");
		for(int i = 0; i < times; i++) {
			
		
		key.add(input.nextInt());
		input.nextLine();
		codes.add(input.nextLine());
		
		}
		for(String s: codes) {
			
			for(int i = 0; i < s.length(); i++) {
				
				int asc = (int)s.charAt(i);
				System.out.println(asc);
				int newa = asc - key.get(codes.indexOf(s));
				if(newa < 97 && newa > 90) {
					newa += 25;
				}
				if(newa < 65 ) {
					newa += 25;
				}
				System.out.println(newa);
				System.out.println((char)(newa));
				out = s.replace(s.charAt(i), (char)(newa));
			
				
			}
			System.out.println(out);
			
			
		}
		System.out.println("Transversed the Minefield");
		
	}
	
}
