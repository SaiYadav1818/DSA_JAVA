import java.awt.*;
public class AWTLabel extends Component{
    public static void main(String[] args) {
        Frame f=new Frame();
        
        Label l=new Label("first Label");
        l.setBounds(40,40,40,40);
        f.add(l);
        f.setSize(300,300);
        f.setVisible(true);

    }
}
