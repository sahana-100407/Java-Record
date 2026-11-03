EXP.NO:2D
DATE:04/08/2026
                    Leap Year

Aim:
To write a Java program to check whether a given year is a leap year or not using if-else statements.

Algorithm:
1. Start the program and import the Scanner class.
2. Read a year from the user.
3. Check whether the year is divisible by 400.
4. If not, check divisibility by 100 and 4 to determine whether it is a leap year.
5. Display whether the given year is a leap year or not.

Source Code:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}

Output:
Enter any year: 2024
Year 2024 is a leap year

Result:
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
