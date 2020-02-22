import java.util.Scanner;
public class Jaffy
{
   public static void main(String arg[])
   {
      Scanner in = new Scanner(System.in);
      double miles = in.nextDouble();
      double gallons = in.nextDouble();
      double tank = in.nextDouble();
      double price = in.nextDouble();

      if(miles < (tank * gallons))
      {
         System.out.println("Jaffy drove " + String.format("%.2f", miles) +" miles!");
         System.out.println("Jaffy used " +  String.format("%.2f", (tank / gallons)) + " gallons of gas!");
         System.out.println("Jaffy can drive for " + String.format("%.2f", (tank*gallons)-miles) + " more miles!");
      }
      else
      {
         System.out.println("Jaffy drove " + String.format("%.2f", tank*gallons) +" miles!");
         System.out.println("Jaffy used " +  String.format("%.2f", (tank) + " gallons of gas!"));
         System.out.println("Jaffy can drive for 0.00 more miles!");
      }
      double consumed = tank - gallons;
      System.out.println("It will cost Jaffy $" + String.format("%.2f", (consumed * price)) + " to refill his tank");
   }
}
