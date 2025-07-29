import java.applet.*;
import java.awt.*;
public class AppletParameterPassing extends Applet{
    String fontname;
    int fontsize;
    float leading;
    boolean active;
    public void start()
    {
        String param;
        fontname=getParameter("fontname");
        if(fontname==null)
        {
            fontname="not found";

        }
        param=getParameter("fontsize");
        try{
if(param!=null){
    fontsize=Integer.parseInt(param);

}
else{
    fontsize=0;
}
        }
        catch(NumberFormatException e)
        {
            fontsize=-1;
        }
    

        }
        public void paint(Graphics g){
            g.drawString("fontname"+fontname,0,10);
            g.drawString("fontsize"+fontsize,0,26);
    }}

