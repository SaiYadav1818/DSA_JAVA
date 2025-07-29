import java.awt.Color;
import java.applet.*;
import java.awt.Graphics;
public class AppletUpdate  extends Applet{.
    public void init()
    {
        setBackground(Color.red);
        setForeground(Color.yellow);
    }
 public void updated(Graphics g)
 {

    g.drawString("iam from update",40,40);
 }   
 public void paint(Graphics g)
 {
    updated(g);
    g.drawString("iam from paint",60,60);
 }
}
