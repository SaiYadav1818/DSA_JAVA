import java.awt.Button;
import java.awt.Frame;
import java.awt.*;
public class AWTButton extends Frame {
  AWTButton(){
        Button b=new Button("click");
        b.setBounds(20,100,20,300);
        add(b);
        setSize(300.300);
        setLayout(null);
        setVisible(true);
}        public static void main(String[] args) {
    AWTButton obj=new AWTButton();
    }
}
