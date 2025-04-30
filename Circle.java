import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Circle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    public double calculateShape() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
