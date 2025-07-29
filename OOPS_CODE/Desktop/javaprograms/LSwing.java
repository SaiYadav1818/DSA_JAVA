import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LSwing {
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public LSwing(){
        // Create the frame
        frame = new JFrame("Swing Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        label = new JLabel("Enter your name:");
        textField = new JTextField(15);
        button = new JButton("Submit");

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LSwing();
            }
        });
    }
}

