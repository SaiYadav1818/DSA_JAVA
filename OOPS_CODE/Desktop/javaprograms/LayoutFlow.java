import java.awt.*;
import java.applet.*;
public class LayoutFlow extends Applet {
    public void init()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Button b1 = new Button("click");
    Button b2 = new Button("");
    add(b1);
    add(b2);
    }
}
/*<html>
<applet code="LayoutFlow.class" width=500 height=500></applet>
</html> */
