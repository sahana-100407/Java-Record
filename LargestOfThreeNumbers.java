EXP.NO:2C
DATE:04/08/2026
                    Largest Of Three Numbers

Aim:
To write a Java program to find the largest among three numbers using if-else statements.

Algorithm:
1. Start the program and import the Scanner class.
2. Read three integer values from the user.
3. Compare the three numbers using if-else statements.
4. Display the largest number.
5. If the numbers are equal or not distinct, display the appropriate message.

Source Code:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}

Output:
Enter three integers:
10
25
15
Second number is largest

Result:
Thus, the Java program to find the largest among three numbers using if-else statements was executed successfully.
