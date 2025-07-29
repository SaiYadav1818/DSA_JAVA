import java.awt.*;
import java.awt.event.*;

public class LAWT {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Example");

        // Create a Button
        Button button = new Button("Click Me!");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and layout
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Make the frame visible
        frame.setVisible(true);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

