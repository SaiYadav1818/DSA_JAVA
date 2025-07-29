
import java.awt.*;
import java.applet.*;
public class LGridBorderLayOut extends Applet
{
public void init()
{
GridBagLayout g=new GridBagLayout();
GridBagConstraints c=new GridBagConstraints();
setLayout(g);
 c.insets = new Insets(2, 2, 2, 2); 
 // column 0 
 c.gridx = 0; 
 // row 0 
 c.gridy = 0; 
// increases components width by 10 pixels 
 c.ipadx = 15; 
// increases components height by 50 pixels 
 c.ipady = 50;
 // constraints passed in 
 add(new Button("Java Swing"), c); 
 
 // column 1 
 c.gridx = 1; 
// increases components width by 70 pixels 
 c.ipadx = 90; 
 // increases components height by 40 pixels 
 c.ipady = 40;
// constraints passed in 
 add(new Button("Layout"), c); 
 // column 0 
 c.gridx = 0; 
// row 1
 c.gridy = 1; 
// increases components width by 20 pixels 
 c.ipadx = 20; 
 // increases components height by 20 pixels 
 c.ipady = 20; 
 // constraints passed in 
 add(new Button("Manager"), c); 
 // increases components width by 10 pixels 
 c.ipadx = 10; 
 // column 1 
 c.gridx = 1; 
 // constraints passed in 
 add(new Button("Demo"), c); 
}
}/*<html>
<applet code="LGridBorderLayOut.class" width=200 height=200>
</applet> </html>
*/