import java.awt.Component;
import java.awt.*;
public class AWTCheckBox extends Component {
    public static void main(String[] args) {
        Frame f =new Frame();
        Checkbox  c=new Checkbox("c++");
        Checkbox  c1=new Checkbox("java" ,true);
        c.setBounds(40,40,40,40);
        c1.setBounds(30,30,30,30);
        f.setSize(300,300);
        f.add(c);
        f.add(c1);
        f.setVisible(true);
f.setLayout(null);
    }
}
