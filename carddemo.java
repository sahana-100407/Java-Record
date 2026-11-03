EXP.NO:12B
DATE:13/10/2026
                  Card Layout

Aim:
To write a Java Applet program to demonstrate CardLayout using buttons.

Algorithm:
1. Import the required AWT, Applet and Event packages.
2. Create an Applet class named `carddemo` implementing `ActionListener`.
3. Create a Panel and set its layout to `CardLayout`.
4. Create three buttons and add them to the panel with different names.
5. Register ActionListener for each button.
6. Use `buttonCardLayout.next()` to display the next button when a button is clicked.

Source Code:
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

Result:
Thus, the Java Applet program to demonstrate CardLayout using buttons was executed successfully.
