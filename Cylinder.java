import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder() {
        super("Cylinder");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
