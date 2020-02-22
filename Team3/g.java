import java.util.Scanner;
public class g
{
   public static void main(String arg[])
   {
      Scanner in = new Scanner(System.in);
      int degrees = in.nextInt();
      String placeholder = in.nextLine();
      String[] line = new String[10];
      for(int x = 0; x < 10; x++)
      {
      line[x] = in.nextLine();
      }
      if(degrees == 270)
      { for(int z = 0; z < 10; z++)
         {
         System.out.println();
            for (int y = 9; y >=0 ; y--)
            {
            System.out.print(line[y].charAt(z));
            
            }
            
         } 
      }
      else if(degrees == 180)
      { for(int a = 9; a >= 0; a--)
      {
      System.out.println();
            for (int b = 9; b >= 0; b--)
            {
            System.out.print(line[a].charAt(b));
            
            }
            
         }
      } 
      else if(degrees == 90)
      { 
         for(int d = 9; d >= 0; d--){
         System.out.println();
            for (int c = 0; c < 10; c++)
            {
            System.out.print(line[c].charAt(d));
            
            }
            
            }
       }
      else if(degrees == 0 || degrees == 360)
      {
      System.out.println();
         for(int f = 0;f < 10; f++)
         {
         System.out.println(line[f]);
         }
      }
      System.out.println();
   }
}
