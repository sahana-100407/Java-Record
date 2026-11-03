EXP.NO:12B
DATE:13/10/2026
                      Border Layout

Aim:
To write a Java Applet program to demonstrate BorderLayout using buttons and a TextArea.

Algorithm:
1. Import the required AWT and Applet packages.
2. Create an Applet class named `insertdemo`.
3. Set the background color to cyan.
4. Set the layout using `BorderLayout`.
5. Add buttons to the North, South, East and West regions.
6. Add a TextArea to the Center region and set the insets.

Source Code:
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}

Result:
Thus, the Java Applet program to demonstrate BorderLayout using buttons and TextArea was executed successfully.
