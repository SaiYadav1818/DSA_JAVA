import java.applet.Applet;
import java.awt.Graphics;
public class htmlinput1 extends Applet {
        public void paint(Graphics g)
        {
        int x=0;
        int y=0;
        String msg="";
       msg= getParameter("msg");
       x=Integer.parseInt(getParameter("xposition"));
       y=Integer.parseInt(getParameter("yposition"));
    
            g.drawString(msg, x, y);
        }
    }
    
/*
 <html><body>
 <head>
 <title>
 Applet view
 </title>
 </head>
<hr>
<applet code="htmlinput1.class" width="500" height="500">
<param name="msg" value="hi how are you">
<param name="xposition" value="100">
<param name="yposition" value ="100">
</applet>
<hr>
</body>

 </html>
 */
