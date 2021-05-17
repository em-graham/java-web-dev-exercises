package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your distance in miles: ");
        double miles = input.nextDouble();

        System.out.println("Please enter the amount of gas used in gallons: ");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("You run on " + milesPerGallon + " miles per gallon");
    }
}
