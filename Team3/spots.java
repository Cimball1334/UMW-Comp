import java.util.Scanner;
import java.util.Arrays;
public class spots
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int pairNum = in.nextInt();
      int[] spots = new int[pairNum];
      for(int x = 0; x < pairNum; x++)
      {
      int firstNum = in.nextInt();
      int secNum = in.nextInt();
      spots[x] = firstNum + secNum;      
      }
      for (int y = 0; y < pairNum; y++)
      {
      System.out.println(spots[y]);
      } 
   }
}

