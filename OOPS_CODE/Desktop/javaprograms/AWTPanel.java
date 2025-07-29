import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
public class AWTPanel {
    public static void main(String[] args) {
        Frame f=new Frame("panel not have title bar");
Panel p=new Panel();
f.setSize(400,400);
f.setBackground(Color.red);
f.setLayout(null);
p.setSize(100,100);
p.setBackground(Color.YELLOW);
f.add(p);

    }
}
