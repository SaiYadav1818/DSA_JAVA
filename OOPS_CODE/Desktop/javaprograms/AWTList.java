import java.awt.*;
public class AWTList {
    AWTList()
    {
Frame f=new Frame();
List l=new List(5);
l.setBounds(100,100,75,85);
l.add("item1");
l.add("item2");
l.add("item3");
f.add(l);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
    }
 public static void main(String[] args) {
    new AWTList();
 }   
}
