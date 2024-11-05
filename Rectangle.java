import java.util.Scanner;
public class Rectangle {
   
    // Attributes with default values
    private double length = 1.0;
    private double width = 1.0;

    // Setter for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Length must be greater than 0.0 and less than 20.0.");
        }
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Width must be greater than 0.0 and less than 20.0.");
        }
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}


    