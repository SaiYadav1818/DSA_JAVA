import java.awt.*;

public class AWTChoice {
    AWTChoice()
    {
        Frame f =new Frame();
        Choice c=new Choice();
        c.setBounds(200,200,200,200);
        c.add("item1");
        c.add("item3");
        f.add(c);
        f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
    }
    public static void main(String[] args) {
       new AWTChoice() ;
    }
}
