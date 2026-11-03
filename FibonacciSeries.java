EXP.NO:06
DATE:18/08/2026
                Fibonacci Series

Aim:
To write a Java program to generate the Fibonacci series using a method.

Algorithm:
1. Start the program and import the Scanner class.
2. Read the number of terms from the user.
3. Initialize the first two numbers as 0 and 1.
4. Generate the next number by adding the previous two numbers using a loop.
5. Display the Fibonacci series and stop the program.

Source Code:
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}

Output:
Enter the value of n: 7
0 1 1 2 3 5 8

Result:
Thus, the Java program to generate the Fibonacci series was executed successfully.
