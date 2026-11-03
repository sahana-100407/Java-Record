EXP.NO:05
DATE:18/08/2026
                            Armstrong Number

Aim:
To write a Java program to check whether a given positive number is an Armstrong number or not.

Algorithm:
1. Step 1: Start the program.
2. Step 2: Declare the variables `n`, `nu`, `num = 0`, and `rem`.
3. Step 3: Get a positive number `n` from the user.
4. Step 4: Assign `n` to `nu`.
5. Step 5: Repeat Steps 6 to 8 until `nu != 0`.
6. Step 6: Find the remainder using `rem = nu % 10`.
7. Step 7: Calculate `num = num + rem * rem * rem`.
8. Step 8: Divide `nu` by 10 (`nu = nu / 10`).
9. Step 9: Check whether `num == n`.
10. Step 10: If true, display "Armstrong Number"; otherwise, display "Not an Armstrong Number".
11. Step 11: Stop the program.

Source Code:
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}

Output:
Enter any Positive Number : 153
Armstrong Number

Result:
Thus, the Java program to check whether a given positive number is an Armstrong number or not was successfully executed and the expected output was obtained.
