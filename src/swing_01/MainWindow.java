package swing_01;

import javax.swing.JFrame;

public class MainWindow {
    
    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("Hello World!");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        window.setSize(800, 500);
        window.setLocationRelativeTo(null); //centers on screen
    }

    public void show() {
        window.setVisible(true);
    }
    
}
