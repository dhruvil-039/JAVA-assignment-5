import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere() {
        super("Sphere");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    public double calculateShape() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
