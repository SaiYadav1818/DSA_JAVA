import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Applet8 extends Applet {
    String msg = "hell ";

    public void init() {
        resize(150,150);
        setBackground(Color.cyan);
        setForeground(Color.RED);
        msg += "inside init() ";
    }

    public void start() {
        msg += "inside start() ";
    }

    public void paint(Graphics g) {
        g.drawString(msg + "message in paint()", 60, 60);
    }
}


