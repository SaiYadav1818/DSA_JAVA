import java.awt.*;
public class AWTScrollBar {
    AWTScrollBar()
    {
Frame f=new Frame("Scroll bar");
 Scrollbar s=new Scrollbar();
s.setBounds(100, 0100, 100, 100);
 f.add(s);
 f.setSize(400,400);
f.setBackground(Color.red);
f.setLayout(null);
f.setVisible(true);
    }   
     public static void main(String[] args) {
        new AWTScrollBar();
    }
}
