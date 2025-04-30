import java.util.Scanner;

public class Square extends Shape {
    private double side;

    public Square() {
        super("Square");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextDouble();
    }

    public double calculateShape() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
