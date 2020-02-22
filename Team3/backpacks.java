import java.util.Scanner;
public class backpacks
{
   public static void main(String arg[])
   {
      Scanner in = new Scanner(System.in);
      int bps = in.nextInt();
      double[] backpacks = new double[bps];
      for(int x = 0; x< bps; x++)
         {
         double weight = in.nextDouble();
         backpacks[x] = weight;
         }
         for(int y = 0; y < (bps - 1); y++)
         {
         if(backpacks[y] > backpacks[y + 1])
         {
         double temp = backpacks[y];
         backpacks[y] = backpacks[y + 1];
         backpacks[y + 1] = temp;
         }
         }
         double heaviest = backpacks[(bps - 1)];
      System.out.println("Heaviest backpack: " + String.format("%.1f",heaviest));
       for(int y = 0; y < (bps - 1); y++)
         {
         if(backpacks[y] < backpacks[y + 1])
         {
         double temp = backpacks[y];
         backpacks[y] = backpacks[y + 1];
         backpacks[y + 1] = temp;
         }
         }
    System.out.println("Lightest backpack: " + String.format("%.1f",backpacks[bps - 1]));
    double total = 0;
    for (int a = 0; a < bps; a++)
    {
    total += backpacks[a];
    }
    System.out.println("Average weight of all backpacks: " + String.format("%.1f",(total/bps)));

      }
   }

