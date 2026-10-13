EXP.NO:1C
DATE:28/07/2026
    
                Find largest and smallest number in an array

Aim:
To write a Java program to find the sum, largest number, and smallest number in an array.

Algorithm:
1. Start the program and initialize the array with elements.
2. Initialize sum to 0 and min and max with the first array element.
3. Traverse the array using a for loop.
4. Find the largest and smallest elements and calculate the sum of all elements.
5. Display the sum, largest number, and smallest number, then stop.

Code:
import java.util.Scanner;

public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}

Output:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9

Result:
Thus, the Java program to find the sum, largest number, and smallest number in an array was executed successfully.
