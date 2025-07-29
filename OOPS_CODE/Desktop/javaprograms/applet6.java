import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet6 extends Applet implements ActionListener {
    TextField t1;
    TextField t2;
    TextField t3;
    Button b;
    public void init()
    {
        t1 =new TextField(30);
         t2 =new TextField(30);
         t3 =new TextField(30);
        b =new Button("click");
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b){
int a =Integer.parseInt(t1.getText());
int b= Integer.parseInt(t2.getText());
t3.setText(" "+(a+b));

        }
    }
}
