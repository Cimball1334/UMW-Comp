import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemF {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		double miles = input.nextDouble();
		double mpg = input.nextDouble();
		double gallons =input.nextDouble();
		double price = input.nextDouble();

		if (mpg * gallons >= miles) {
			if (miles < 0) {
				System.out.println("Jaffy drove " + df.format(-miles) + " miles!");
			} else {
				System.out.println("Jaffy drove " + df.format(miles) + " miles!");

			}
			if (miles < 0) {
				System.out.println("Jaffy used " + df.format(-(double) ((Math.round(100 * (miles / mpg))) / 100))
						+ " gallons of gas!");

			} else {
				System.out.println("Jaffy used " + df.format((double) (Math.round(100 * (miles / mpg))) / 100)
						+ " gallons of gas!");
			}
			if (miles < 0) {

				System.out.println("Jaffy can drive for "
						+ df.format((double) ((Math.round(100 * (gallons + (miles / mpg)) * mpg)) / 100))
						+ " more miles!");
			} else {
				System.out.println("Jaffy can drive for "
						+ df.format((double) ((Math.round(100 * (gallons - (miles / mpg)) * mpg)) / 100))
						+ " more miles!");
			}

			if (miles < 0) {
				System.out.println(
						"It will cost Jaffy $" + df.format(-(double) (Math.round(100 * (miles / mpg) * price)) / 100)
								+ " to refill his tank!");

			} else {
				System.out.println("It will cost Jaffy $"
						+ df.format((double) (Math.round(100 * (miles / mpg) * price)) / 100) + " to refill his tank!");

			}

		} else {
			if (miles < 0) {
				System.out.println("Jaffy drove " + df.format(-gallons / mpg) + " miles!");

			} else {
				System.out.println("Jaffy drove " + df.format(gallons / mpg) + " miles!");

			}
			System.out.println(
					"Jaffy used " + df.format((double) (Math.round(100 * gallons)) / 100) + " gallons of gas!");
			System.out.println("Jaffy can drive for 0.00 more miles!");

			System.out.println("It will cost Jaffy $" + df.format((double) (Math.round(100 * (gallons * price))) / 100)
					+ " to refill his tank!");

		}
	}
}
