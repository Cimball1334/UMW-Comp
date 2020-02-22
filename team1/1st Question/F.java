import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double miles = keyboard.nextDouble();
        double mpg = keyboard.nextDouble();
        double  gasCap = keyboard.nextDouble();
        double gasPrice = keyboard.nextDouble();
        
        if (mpg * gasCap > miles)
            System.out.println("Jaffy drove " + String.format("%.2f",miles) + " miles!");
        else {
            System.out.println("Jaffy drove " + String.format("%.2f",(mpg*gasCap)) + " miles!");
            miles = (mpg*gasCap);
        }
        double gasUsed = (miles/mpg);
        System.out.println("Jaffy used " + String.format("%.2f",gasUsed) + " gallons of gas!");
        
        if ((gasCap - gasUsed)*mpg > 0)
            System.out.println("Jaffy can drive for " + String.format("%.2f",((gasCap - gasUsed)*mpg)) + " more miles!");
        else
            System.out.println("Jaffy can drive for " + 0 + " more miles!");
        System.out.println("It will cost Jaffy $" + String.format("%.2f",(gasUsed * gasPrice)) + " to refill his tank!");
    }
}