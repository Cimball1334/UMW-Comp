import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class Engine
{
   public static void main(String arg[])
   {
       Scanner in = new Scanner(System.in);
         int size = in.nextInt();
       ArrayList<String> problem = new ArrayList<String>();
       
       for(int x = 0; x <= size; x++)
       {
         problem.add( in.next());
       }
       
       for(int x = 0; x < size; x++)
       {
         if(problem.get(x).equals("/"))
         {
            double first = Integer.valueOf(problem.get(x-1));
            double second = Integer.valueOf(problem.get(x+1));
            double ansure = first / second;
            problem.set(x, "" + ansure);
            problem.remove(x+1);
            problem.remove(x-1);
            System.out.println(problem);
         }
       }
  
   }
}