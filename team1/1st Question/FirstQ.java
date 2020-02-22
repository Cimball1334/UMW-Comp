import java.util.*;
public class FirstQ
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int counter = 0;
        int numbers[] = new int[p*2];
        while(counter != numbers.length)
        {
            numbers[counter]=input.nextInt();
            counter++;
        }
        int sum = 0 ;
        for(int x = 0; x<numbers.length-1;x+=2)
        {
            sum = numbers[x] + numbers[x+1];
            System.out.println(sum);
            sum=0;
        }
    }
}
