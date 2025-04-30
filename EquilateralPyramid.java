import java.util.Scanner;

public class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid() {
        super("Square Pyramid");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base side: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    public double calculateShape() {
        double slantHeight = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base * base + 2 * base * slantHeight;
    }

    public double calculatePerimeter() {
        return 4 * base;
    }

    public double calculateVolume() {
        return (1.0 / 3) * base * base * height;
    }
}
