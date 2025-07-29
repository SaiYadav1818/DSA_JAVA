import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class LSmileyApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);

        // Draw the mouth
        g.drawArc(100, 150, 100, 50, 0, -180);
    }
}

/*
<html>
    <applet code="LSmileyApplet.class" width="300" height="300"></applet>
</html>
 */