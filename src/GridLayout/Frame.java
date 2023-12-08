package GridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

    private JFrame frame;

    public Frame() {

        initialize();
    }

    private void initialize() {
        frame = new JFrame();

        frame.setTitle("GridLayout Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 0, 10, 10));

        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
    
}
