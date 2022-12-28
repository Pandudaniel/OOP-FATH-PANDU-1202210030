import java.util.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();

        do {
            try {
                System.out.println("""
                        WELCOME TO OUR CALCULATION PROGRAMM

                        ==== Menu Program ====

                        1. Square
                        2. Circle
                        3. Trapezoid
                        0. Exit
                                """);
                System.out.print("Select Menu : ");

                int pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = input.nextDouble();
                        calculation.setSquare(side);
                        calculation.run();
                        System.out.println("\nThe calculation result : " + calculation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double r = input.nextDouble();
                        calculation.setCircle(r);
                        ;
                        ;
                        calculation.run();
                        System.out.println("\nThe calculation result : " + calculation.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of trapezoid : ");
                        double a = input.nextDouble();

                        System.out.print("Enter the upperside of trapezoid : ");
                        double b = input.nextDouble();

                        System.out.print("Enter the height trapezoid : ");
                        double t = input.nextDouble();

                        calculation.setTrapezoid(a, b, t);
                        calculation.run();
                        System.out.println("\nThe calculation result : " + calculation.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program Ended");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } while (repeat);
        input.close();
    }
}
