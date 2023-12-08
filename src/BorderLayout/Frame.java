package BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;

public class Frame {
    private JFrame frame;

    public Frame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();

        frame.setTitle("BorderLayout Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(5, 5));

        //add a component to one of the five areas (north, east, south, west, center)
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
