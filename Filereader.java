EXP.NO:11B
DATE:29/09/2026
                    File Reader

Aim:
To write a Java program to read the contents of a file using the FileReader class.

Algorithm:
1. Start the program and import the required I/O package.
2. Create a FileReader object to open `sample2.txt`.
3. Read the file character by character using the `read()` method.
4. Display each character until the end of the file is reached (`-1`).
5. Close the file and handle exceptions.

Source Code:
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}

Output:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

Result:
Thus, the Java program to read the contents of a file using the FileReader class was executed successfully.
