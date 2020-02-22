import java.util.Scanner;
public class Jessie
{
   public static void main(String arg[])
   {
      Scanner in = new Scanner(System.in);
      int calls = in.nextInt();
      
      int inches = 36 + ((calls * 6));
      int feet = inches / 12;
      
      
      if(feet <= 19 && (inches % 12) == 0)
      {
         System.out.println("Jessie's height is " + feet + " feet.");
      }
      else  if(feet <= 19 &&(inches % 12) != 0)
      {
         System.out.println("Jessie's height is " + feet + " and 1 half feet.");
      }
      else if(feet >= 19 && (inches % 12) == 0)
      {
         System.out.println("Jessie's height is " + feet + " feet!");
      }
      else  if(feet >= 19 && (inches % 12) != 0)
      {
         System.out.println("Jessie's height is " + feet +" and 1 half feet!");
      }
      
      
   } 
}