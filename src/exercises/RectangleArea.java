package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the rectangle's length: ");
        int length = input.nextInt();

        System.out.println("Please enter the rectangle's width: ");
        int width = input.nextInt();

        int area = length * width;
        input.close();
        System.out.println("The rectangle's area is " + area);
    }
}
