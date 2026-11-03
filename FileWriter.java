EXP.NO:11A
DATE:29/09/2026

                File Writer

Aim:
To write a Java program to write the English uppercase alphabets (A–Z) into a file using FileWriter.

Algorithm:
1. Start the program.
2. Create a FileWriter object to create or open `sample2.txt`.
3. Use a loop to generate characters from A to Z.
4. Write each character into the file using `write()` method.
5. Close the file using `close()` method and handle exceptions.

Source Code:
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}

Output:
Program executed successfully.

Content stored in sample2.txt:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

Result:
Thus, the Java program to write uppercase alphabets into a file using FileWriter was executed successfully.
