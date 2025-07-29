import java.awt.*;
import java.applet.*;
public class LayoutGrid extends Applet {
    public void init()
    {
        setLayout(new GridLayout(2,6));
        Button b1 = new Button("east1");
    Button b2 = new Button("west2");
    Button b3 = new Button("south3");
    Button b4 = new Button("north4");
    Button b5 = new Button("west5");
    Button b6 = new Button("south6");
    Button b7 = new Button("north7");
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);/*
    add(b4,BorderLayout.NORTH);*/
    }
}
/*<html>
<applet code="LayoutGrid.class" width=800 height=800></applet>
</html> */
