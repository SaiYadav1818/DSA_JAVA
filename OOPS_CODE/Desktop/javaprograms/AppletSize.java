import java.applet.*;
import java.awt.*;
public class AppletSize extends Applet{
    public void paint(Graphics g)
    {
        Dimension as=this.getSize();
        int ah=as.height;
        int aw=as.width;
        System.out.println(ah+" "+ aw);
    }
}
