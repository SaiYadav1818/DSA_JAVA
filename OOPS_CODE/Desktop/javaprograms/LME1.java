import java.awt.*;
import java.awt.event.*;
public class LME1 extends MouseAdapter {
    Frame f;
    LME1()
    {
        f=new Frame();
        f.addMouseListener(this);
f.setSize(400,400);
f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.green);
        g.drawString("mouse clicked", 50, 50);
    
    }
    public static void main(String[] args) {
        LME1 obj = new LME1();
    }
    
}
