EXP.NO:12A
DATE:13/10/2026
                      Grid Layout

Aim:
To write a Java Applet program to demonstrate GridLayout using 5 rows and 2 columns.

Algorithm:
1. Import the required AWT and Applet packages.
2. Create an Applet class named `gld`.
3. Set the layout using `GridLayout(5,2)`.
4. Create 10 buttons with labels A to J.
5. Add all buttons to the Applet and set the insets.

Source Code:
import java.awt.*;
import java.io.*;
import java.applet.*;

public class gld extends Applet
{
    public void init()
    {
        setLayout(new GridLayout(5,2));

        Button b1=new Button("A");
        Button b2=new Button("B");
        Button b3=new Button("C");
        Button b4=new Button("D");
        Button b5=new Button("E");
        Button b6=new Button("F");
        Button b7=new Button("G");
        Button b8=new Button("H");
        Button b9=new Button("I");
        Button b10=new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets()
    {
        return new Insets(20,20,20,20);
    }
}

Output:
A window displays 10 buttons arranged in **5 rows and 2 columns**.

+-------+-------+
|   A   |   B   |
+-------+-------+
|   C   |   D   |
+-------+-------+
|   E   |   F   |
+-------+-------+
|   G   |   H   |
+-------+-------+
|   I   |   J   |
+-------+-------+

Result:
Thus, the Java Applet program to demonstrate GridLayout with 5 rows and 2 columns was successfully executed.
