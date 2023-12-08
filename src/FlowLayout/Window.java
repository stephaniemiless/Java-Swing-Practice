package FlowLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
    
    private JFrame frame;
    private JPanel panel;

    public Window() {
        //flowlayout:
        // positions components from left to right on a single line until it
        // runs out of real estate

        //wraps to the next line when you run out of room on the first line

        initialize();
    }

    private void initialize() {

        frame = new JFrame();

        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        frame.setTitle("FlowLayout Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panel.setBackground(Color.PINK);

        for (int i = 1; i <= 5; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);

    }
}
