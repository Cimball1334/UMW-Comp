import java.util.*;
public class D
{
    public static void main(String[] args)
    {
        double heaviest = 0;
        double lightest = 999999999;
        double average = 0;
        Scanner input = new Scanner(System.in);
        double packs = input.nextDouble();
        for(int x = 0; x<packs; x++)
        {
            double temp = input.nextDouble();
            if(temp > heaviest)
            {
                heaviest = temp;
            }
            if(temp < lightest)
            {
                lightest = temp;
            }
            average+=temp;
        }
        //System.out.println(average);
        System.out.println("Heaviest backpack: "+String.format("%.1f",heaviest));
        System.out.println("Lightest backpack: "+String.format("%.1f",lightest));
        System.out.println("Average weight of all backpacks: "+String.format("%.1f",average/packs));
    }
}