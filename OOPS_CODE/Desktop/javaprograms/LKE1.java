import java.awt.*;
import java.awt.event.*;

public class LKE1 extends Frame implements KeyListener {
    Label l;
    TextArea area;

    LKE1() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);

        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Key released");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Key typed");
    }

    public static void main(String[] args) {
        new LKE1();
    }
}
