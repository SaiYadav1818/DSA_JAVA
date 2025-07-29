import java.applet.Applet;
import java.awt.Graphics;
public class myapplet extends Applet {
/*<applet code="myapplet" width="300" height="300" ></applet> */
    public void paint(Graphics g)
    {
        g.drawString("hello world",200,150);
    }
}