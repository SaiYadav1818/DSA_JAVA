import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class LButtonExpection extends Applet implements ActionListener,TextListener {

    Label l1 = new Label("num1");
    TextField t1 = new TextField(10);
    Label l2 = new Label("num2");
    TextField t2 = new TextField(10);
    Label l3 = new Label("div");
    TextField t3 = new TextField(10);
Button b1 = new Button("divsion");
public void init()
{
    setLayout(new GridLayout(3,4) );
    add(t1);
    add(t2);
    add(t3);
    add(l1);
    add(l2);
    add(l3);
    add(b1);
    b1.addActionListener(this);
    t1.addTextListener(this);
    t2.addTextListener(this);
    b1.setEnabled(false); 
}
   public void actionPerformed(ActionEvent e)
   {
    try {
    if(e.getSource()==b1){
        int n1 =Integer.parseInt(t1.getText());
        int n2 =Integer.parseInt(t2.getText());
float res=n1/n2;
t3.setText(String.valueOf(res));
    }
  
}
    catch(NumberFormatException nfc)
    {
        javax.swing.JOptionPane.showMessageDialog(this,"please enter integer value");
    }
    catch(ArithmeticException afe)
    {
        javax.swing.JOptionPane.showMessageDialog(this,"please enter non zero values");
    }
   } 
   public void textValueChanged(TextEvent te)
   {
    if(!t1.getText().equals("")&&(!t2.getText().equals("")))
    {
        b1.setEnabled(true);
    }
    else
    {
        b1.setEnabled(false);
    }
   }
}
/*
 <html>
 <applet code="LButtonExpection.class" width=300 height=300>
 </applet>
 </html>
 */