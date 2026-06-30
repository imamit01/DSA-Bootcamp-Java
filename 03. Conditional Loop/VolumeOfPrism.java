import java.util.*;

public class VolumeOfPrism {

    public static double RectangularPrism(double length, double breadth) {
        double base_area = length * breadth;
        return base_area;
    }

    public static double TriangularPrism(double Base, double Height) {
        double base_area = 0.5 * Base * Height;
        return base_area;
    }

    public static double CircularPrism(double r) {
        double base_area = Math.PI * r * r;
        return base_area;
    }

    public static double SquarePrism(double side) {
        double base_area = side * side;
        return base_area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Prism Calculator");
        System.out.print(
                "Which type of Prism do you have?\n" +
                        "1. Rectangular Prism\n" +
                        "2. Triangular Prism\n" +
                        "3. Circular Prism\n" +
                        "4. Square Prism\n" +
                        "Enter your choice: "
        );

        int cse = sc.nextInt();

        switch (cse) {

            case 1: {
                System.out.print("Enter the length of Rectangular Base: ");
                double l = sc.nextDouble();

                System.out.print("Enter the breadth of Rectangular Base: ");
                double b = sc.nextDouble();

                System.out.print("Enter the height of Prism: ");
                double h = sc.nextDouble();

                double base_area = RectangularPrism(l, b);
                double volume = base_area * h;

                System.out.printf("Volume of Rectangular Prism is : %.2f cm\u00B3%n", volume);
                break;
            }

            case 2: {
                System.out.print("Enter the base of Triangular Base: ");
                double base = sc.nextDouble();

                System.out.print("Enter the height of Triangular Base: ");
                double height = sc.nextDouble();

                System.out.print("Enter the height of Prism: ");
                double prismHeight = sc.nextDouble();

                double base_area = TriangularPrism(base, height);
                double volume = base_area * prismHeight;

                System.out.printf("Volume of Triangular Prism is : %.2f cm\u00B3%n", volume);
                break;
            }

            case 3: {
                System.out.print("Enter the radius of Circular Base: ");
                double radius = sc.nextDouble();

                System.out.print("Enter the height of Prism: ");
                double height = sc.nextDouble();

                double base_area = CircularPrism(radius);
                double volume = base_area * height;

                System.out.printf("Volume of Circular Prism is : %.2f cm\u00B3%n", volume);
                break;
            }

            case 4: {
                System.out.print("Enter the side of Square Base: ");
                double side = sc.nextDouble();

                System.out.print("Enter the height of Prism: ");
                double height = sc.nextDouble();

                double base_area = SquarePrism(side);
                double volume = base_area * height;

                System.out.printf("Volume of Square Prism is : %.2f cm\u00B3%n", volume);
                break;
            }

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}