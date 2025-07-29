import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class  applet2 extends Applet {
    public void  init()
    {
        resize(150,150);
        setBackground(Color.RED);
    }
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 60, 60);
        g.drawString("Hi, Hero!", 30, 30);
    }
}
