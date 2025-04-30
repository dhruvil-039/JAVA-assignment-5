// Name: Dhruvil Galaiya
// PRN: 23070126039
// Batch: A2

// ShapeMain.java
import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;
        Volume vol = null;

        while (true) {
            clearScreen(); // Clear screen for better readability in console
            System.out.println("\n---- Menu ----");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Square Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    shape = new Circle();
                    displayResults(shape, null);
                    break;
                case 2:
                    shape = new Rectangle();
                    displayResults(shape, null);
                    break;
                case 3:
                    shape = new Square();
                    displayResults(shape, null);
                    break;
                case 4:
                    vol = (Sphere) new Sphere();
                    shape = (Shape) vol;
                    displayResults(shape, vol);
                    break;
                case 5:
                    vol = (Cylinder) new Cylinder();
                    shape = (Shape) vol;
                    displayResults(shape, vol);
                    break;
                case 6:
                    vol = (EquilateralPyramid) new EquilateralPyramid();
                    shape = (Shape) vol;
                    displayResults(shape, vol);
                    break;
                case 7:
                    System.out.println("Thank you for using Shape Calculator. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void displayResults(Shape shape, Volume vol) {
        System.out.printf("Area of %s: %.2f\n", shape.shape, shape.calculateShape());
        double peri = shape.calculatePerimeter();
        if (peri != 0)
            System.out.printf("Perimeter: %.2f\n", peri);
        if (vol != null)
            System.out.printf("Volume: %.2f\n", vol.calculateVolume());
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
