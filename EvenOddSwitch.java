EXP.NO:2B
DATE:04/08/2026
            even or Odd Using Switch Case

Aim:
To write a Java program to check whether a given number is even or odd using a switch statement.

Algorithm:
1. Start the program.
2. Declare an integer variable n.
3. Get a number n from the user.
4. Calculate the remainder using n % 2.
5. Use a switch statement to check the remainder.
6. If the remainder is 0, display "This number is even".
7. If the remainder is 1, display "This number is odd".
8. If no case matches, display "Invalid input".
9. Stop the program.

Source Code:
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}

Output:
Enter a number: 10
This number is even

Result:
Thus, the Java program to check whether a given number is even or odd using a switch statement was successfully executed and the expected output was obtained.
