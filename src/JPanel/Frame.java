package JPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.Dimension;

public class Frame {
    
    JFrame frame;

    public Frame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("JPanel Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 5));
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.RED);

        frame.add(panel, BorderLayout.NORTH);

        Button button = new Button("Button 1");
        panel.add(button);

        Button button2 = new Button("Button 2");
        panel.add(button2);

        Button button3 = new Button("Button 3");
        panel.add(button3);

        //panel.setPreferredSize(new Dimension(250, 250));

        frame.setVisible(true);
    }
}
