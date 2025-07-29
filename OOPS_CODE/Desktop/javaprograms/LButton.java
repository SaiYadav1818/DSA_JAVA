import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class LButton extends Applet implements ActionListener {
    TextField t1 = new TextField(1);
    TextField t2 = new TextField(15);
    TextField t3 = new TextField(20);
    Label l1 = new Label("Firstno");
    Label l2 = new Label("Secondno");
    Label l3 = new Label("Sum");
    Button b1 = new Button("Add");
    Button b2 = new Button("RESULT");
    public void init() {
        setLayout(new GridLayout(3, 4));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText("" + (n1 + n2));
        }
        if (e.getSource() == b2) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText("" + (n1 -n2));
        }
    }
}
/* 
<html>
<applet code="LButton.class" width=300 height=300>
</applet>
</html>
*/ 
