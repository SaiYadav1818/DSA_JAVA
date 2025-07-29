import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class applet5 extends Applet implements ActionListener {
    TextField t;  // Make TextField an instance variable
    Button b;     // Make Button an instance variable

    public void init() {
        t = new TextField(70);
        b = new Button("click");
        add(t);
        add(b);
        b.addActionListener(this);  // Add ActionListener to the button
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            t.setText("welcome cse");
          
        }
    }
}


