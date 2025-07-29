import java.awt.*;
import java.awt.event.*;

public class LME extends Frame implements MouseListener, MouseMotionListener {
    Label l;

    LME() {
        addMouseListener(this);
        addMouseMotionListener(this);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("mouse clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("mouse exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("mouse PRESSED");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("mouse REALESED");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("mouse DRAGGGGGED");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("mouse MOVED");
    }

    public static void main(String[] args) {
        new LME();
    }
}


