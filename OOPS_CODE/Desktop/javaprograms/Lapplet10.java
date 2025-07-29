import java.applet.*;
import java.awt.*;
public class Lapplet10 extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.black);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);
        g.drawArc(100, 150, 100, 50, 0, -180);
    }
}
/*<html>
<applet code="Lapplet10.class" width=300 height=300>
</applet>
 </html>
 */