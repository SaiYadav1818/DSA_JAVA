import javax.swing.JApplet;
import java.awt.Graphics;

public class HelloWorldApplet extends JApplet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
}

