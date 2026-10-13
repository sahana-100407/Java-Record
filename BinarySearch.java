EXP.NO:1B
DATE:28/07/2026
                            Binary Search
Aim:
To write a Java program to search for an element in a sorted array using the Binary Search technique.

Algorithm:
1. Start the program and read the number of elements.
2. Read the array elements in sorted order.
3. Read the element to be searched.
4. Find the middle element and compare it with the search element. If equal, display its position; otherwise, search the appropriate half of the array.
5. Repeat until the element is found or the search range becomes empty. Display the result and stop.

Code:    
import java.util.Scanner;

class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}

Output:
Enter number of elements: 5
Enter elements in sorted order:
10
20
30
40
50
Enter element to search: 30
Element found at position 3

Result:
Thus, the Java program to search for an element in a sorted array using the Binary Search technique was executed successfully.
