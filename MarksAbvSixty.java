EXP.NO:1D
DATE:28/07/2026
            To Print Marks above 60

Aim:
To write a Java program to read the names and marks of six students and display the students who scored more than 60 marks.

Algorithm:
1. Start the program and declare arrays to store student names and marks.
2. Read the names and marks of six students using a loop.
3. Check each student's marks using an if condition.
4. If the marks are greater than 60, display the student's name and marks.
5. Stop the program.

Code:
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

Output:
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Sita 55
Enter Name of Student and Marks of Subject 3: Ram 80
Enter Name of Student and Marks of Subject 4: Priya 60
Enter Name of Student and Marks of Subject 5: Arun 90
Enter Name of Student and Marks of Subject 6: Devi 45

Students scoring more than 60:
Ravi : 75
Ram : 80
Arun : 90

Result:
Thus, the Java program to display the names and marks of students who scored more than 60 marks was executed successfully.
