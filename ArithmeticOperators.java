EXP.NO:2A
DATE:04/08/2026
                    Arithmetic Operations using Switch Case

Aim:
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a switch statement.

Algorithm:
1. Start the program and create a Scanner object to read input.
2. Read two numbers from the user.
3. Display the menu of arithmetic operations and read the user's choice.
4. Use a switch statement to perform the selected operation and display the result. Check for division by zero.
5. Repeat the process until the user selects Exit, then stop the program.

Code:    
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

Output:
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result: 30

Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
6
Exiting...

Result:
Thus, the Java program to perform arithmetic operations using a switch statement was executed successfully.
