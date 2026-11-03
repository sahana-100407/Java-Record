EXP.NO:12E
DATE:13/10/2026
                    Drawing Line & Rectangle Using Applets
    
Aim:
To write a Java Applet program to draw different shapes such as lines, rectangles and rounded rectangles using the Graphics class.

Algorithm:
1. Import the required AWT and Applet packages.
2. Create an Applet class named `dinerect`.
3. Override the `paint()` method using the Graphics class.
4. Use `drawLine()` to draw lines.
5. Use `drawRect()` and `fillRect()` to draw rectangles.
6. Use `drawRoundRect()` and `fillRoundRect()` to draw rounded rectangles.

Source Code:
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code="dinerect.class" width="300" height="200"> </applet>
*/

public class dinerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 10, 50, 50);

    g.drawRect(10, 60, 40, 30);
    g.fillRect(60, 10, 30, 80);

    g.drawRoundRect(10, 100, 80, 50, 10, 10);
    g.fillRoundRect(20, 110, 60, 30, 5, 5);

    g.drawLine(100, 10, 230, 140);
    g.drawLine(100, 140, 230, 10);
}
}

Result:
Thus, the Java Applet program to draw lines, rectangles and rounded rectangles using the Graphics class was executed successfully.
