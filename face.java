EXP.NO:12D
DATE:13/10/2026
                     Awaking a Human Face Using Applets

Aim:
To write a Java Applet program to draw a human face using different Graphics methods.

Algorithm:
1. Import the required AWT and Applet packages.
2. Create an Applet class named `face`.
3. Override the `paint()` method using the Graphics class.
4. Use `drawOval()` to draw the face, eyes and ears.
5. Use `fillOval()` to draw the pupils.
6. Use `fillArc()` to draw the nose and mouth.
  
Source Code:
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}

Result:
Thus, the Java Applet program to draw a human face using Graphics methods was executed successfully. 
