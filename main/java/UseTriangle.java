import java.util.Scanner;
public class UseTriangle
{
    public static double check(String side) {
        double returnValue = 0;
        try {
            returnValue = Double.valueOf(side);
        } catch (NumberFormatException bad) {
            System.out.println("ERROR! Non-numerical value has been entered");
            System.exit(0);
        }
        return returnValue;
    }
    public static void main(String args[]) {

            while (true) {
                System.out.println("Enter 3 number lengths for each triangle side" +
                        "Press enter after each number. Press 'q' to quit");
                // Create scanner for one var
                Scanner scan1 = new Scanner(System.in);
                //  Scan input
                String input1 = scan1.nextLine();
                // If 'q' is pressed, terminate
                if (input1.equalsIgnoreCase("q")) {
                    break;
                }
                // New variable for verified input
                double verified1 = check(input1);

                Scanner scan2 = new Scanner(System.in);
                String input2 = scan2.nextLine();
                double verified2 = check(input2);

                Scanner scan3 = new Scanner(System.in);
                String input3 = scan3.nextLine();
                double verified3 = check(input3);
                // Test
                // System.out.println("(Just a temp test) Side A+B+C= " + (verified1 + verified2 + verified3));
                Triangle triangle = new Triangle(verified1, verified2, verified3);

                // Firstly, check if it is a triangle
                if (triangle.isTriangle()) {
                    // After finding it is a triangle, check if is scalene
                    if (!triangle.isScalene()) {
                        // If not scalene, check it isosceles
                        if (!triangle.isIsosceles()) {
                            // If not, verify that it is equilateral
                            triangle.isEquilateral();
                        }
                    }
                }
            }
        }
    }
