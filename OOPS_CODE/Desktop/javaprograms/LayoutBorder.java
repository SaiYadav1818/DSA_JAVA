import java.awt.*;
import java.applet.*;
public class LayoutBorder extends Applet {
    public void init()
    {
        setLayout(new BorderLayout());
        Button b1 = new Button("east");
    Button b2 = new Button("west");
    Button b3 = new Button("south");
    Button b4 = new Button("north");
    add(b1,BorderLayout.EAST);
    add(b2,BorderLayout.WEST);
    add(b3,BorderLayout.SOUTH);/*
    add(b4,BorderLayout.NORTH);*/
    }
}
/*<html>
<applet code="LayoutBorder.class" width=500 height=500></applet>
</html> */
