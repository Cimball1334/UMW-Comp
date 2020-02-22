import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class I { 
    
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int loopNum = keyboard.nextInt();
        int modNum;
        
        ArrayList<String> inputs = new ArrayList<String>();
        
        for (int a = 0; a < loopNum; a++) {
jnk
            String input = keyboard.next();
            inputs.add(input);
        }
        
        for (int b = 0; b < loopNum; b++) {
            String temp = "";
            for (int c = 0; c < inputs.get(b).length(); c++) {
                temp+=inputs.get(b).charAt(c);
            }
            inputs.set(b, temp);
        }
        
        for (int d = 0; d < loopNum; d++) {
            System.out.println(inputs.get(d));
        }
        System.out.println("Traversed the Minefield!");
    }
}