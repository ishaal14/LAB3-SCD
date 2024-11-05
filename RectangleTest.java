import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();
        
        // Get and set length from user
        System.out.print("Enter the length of the rectangle (between 0.0 and 20.0): ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        // Get and set width from user
        System.out.print("Enter the width of the rectangle (between 0.0 and 20.0): ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        // Display the rectangle's attributes
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        scanner.close();
    }
}
 


