import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;

public class AWTButton1 extends Component{
  public static void main(String[] args) {
Frame f=new Frame("button ex");
Button b=new Button("click me");
b.setBounds(150,100,180,130);
f.add(b);
f.setLayout(null);
f.setVisible(true);
  }  
}
