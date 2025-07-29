import java.awt.*;
public class AWTTextAreaField {
    AWTTextAreaField()
    {
        Frame f=new Frame();
        TextArea ta=new TextArea("WELCOME TO GROUND");
        ta.setBounds(100,200,300,400);
        f.add(ta);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);

    }

    public static void main(String[] args) {
        new AWTTextAreaField();
    }

}