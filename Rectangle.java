import java.util.Scanner;

public class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle() {
        super("Rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    public double calculateShape() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
