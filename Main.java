import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> List = new ArrayList<>();
        List.add("a- test Circle()");
        List.add("b- test Rectangle()");
        List.add("c- test Triangle()");
        List.add("exit- To Exit()");

        boolean exit = true;

        do {
            try {
  System.out.println();
                for (String s : List) {
                    System.out.println(s);
                }

                System.out.println();
                System.out.print("Enter number of Method: ");
                String  choice = sc.next();

                switch (choice) {
                    case "exit":
                        System.out.println("Goodbye!");
                        exit = false;
                        break;
                    case "a":
                        testCircle();
                        break;
                    case "b":
                        testRectangle();
                        break;
                    case "c":
                        testRTriangle();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input" + e.getMessage());
                System.out.print("Enter number of Method: ");
                String  choice = sc.next();
            }
        } while (exit);

    }

    public static void testCircle() {
        Circle c1 = new Circle(4);

        System.out.println(" ------- Circle Test ------- ");

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Calculate area of circle: " + c1.calculateArea());
        System.out.println("Calculate Circumference of circle: " + c1.calculateCircumference());
        System.out.println();

        c1.setRadius(5);

        System.out.println(" ------- Update data to Test to setters ------- ");

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Calculate area of circle: " + c1.calculateArea());
        System.out.println("Calculate Circumference of circle: " + c1.calculateCircumference());
        System.out.println();

    }

    public static void testRectangle() {
        Rectangle R1 = new Rectangle(4, 3);

        System.out.println(" ------- Rectangle Test ------- ");
        System.out.println("Height: " + R1.getHeight());
        System.out.println("Width: " + R1.getWidth());
        System.out.println("Calculate area of Rectangle: " + R1.calculateArea());
        System.out.println("Calculate Circumference of Rectangle: " + R1.calculateCircumference());
        System.out.println();


        System.out.println(" ------- Update data to Test to setters ------- ");
        R1.setHeight(8);
        R1.setWidth(18);

        System.out.println("Updated Height: " + R1.getHeight());
        System.out.println("Updated Width: " + R1.getWidth());
        System.out.println("Updated Calculate area of Rectangle: " + R1.calculateArea());
        System.out.println("Updated Calculate Circumference of Rectangle: " + R1.calculateCircumference());
        System.out.println();

    }

    public static void testRTriangle() {
        Triangle T1 = new Triangle(4, 3);

        System.out.println(" ------- Triangle Test ------- ");
        System.out.println("Height: " + T1.getBase());
        System.out.println("Width: " + T1.getHeight());
        System.out.println("Calculate area of Triangle: " + T1.calculateArea());
        System.out.println("Calculate Circumference of Triangle: " + T1.calculateCircumference());
        System.out.println();

        System.out.println(" ------- Update data to Test to setters ------- ");
        T1.setBase(8);
        T1.setHeight(18);

        System.out.println("Updated Height: " + T1.getBase());
        System.out.println("Updated Width: " + T1.getHeight());
        System.out.println("Updated Calculate area of Triangle: " + T1.calculateArea());
        System.out.println("Updated Calculate Circumference of Triangle: " + T1.calculateCircumference());
        System.out.println();

    }
}