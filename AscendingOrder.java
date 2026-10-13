EXP.NO:1A
DATE:28/07/2026
                            Sort in Ascending Order
  
Aim:
To write a Java program to sort the given array elements in ascending order.
  
Algorithm:
1. Start the program.
2. Read the number of elements and store them in an array.
3. Compare each element with the remaining elements.
4. Swap the elements if the first element is greater than the second element.
5. Display the array elements in ascending order and stop the program.

Code:
import java.util.Scanner;
public class
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s = new Scanner(System.in);
System.out.print("Enter no.of elements you wnat in array:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.print("AscendingOrder:");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i] + ",");
}
System.out.print(a[n-1]);
}
}

Output:
Enter no.of elements you want in array: 5
Enter all the elements:
45
12
30
8
20
AscendingOrder:8,12,20,30,45

Result:
Thus, the Java program to sort the array elements in ascending order was executed successfully.
