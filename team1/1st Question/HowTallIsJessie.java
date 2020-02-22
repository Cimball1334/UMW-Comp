import java.util.Scanner;

public class HowTallIsJessie
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String sentence = "Jessie's height is ";
        if (n % 2 == 0)
            sentence += ((n/2)+3) + " feet";
        else
            sentence += ((n/2)+3) + " and 1 half feet";
        if (n > 32)
            sentence += "!";
        else
            sentence += ".";
        System.out.println(sentence);
    }
}
