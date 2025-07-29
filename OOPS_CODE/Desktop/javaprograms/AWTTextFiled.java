import java.awt.*;
public class AWTTextFiled extends Component{
  public static void main(String[] args) {
    Frame f=new Frame("Text field example");
    TextField t1 =new TextField("welcome");
    t1.setBounds(140,140,140,140);
    f.add(t1);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
  }  
}
