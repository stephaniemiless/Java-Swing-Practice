package swing_02;

import javax.swing.JFrame;

public class JFrame1 extends JFrame{
    
    public JFrame1() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrame1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closes entire application
        setSize(500, 400);
        setVisible(true);
        setLocationRelativeTo(null); //appears in the center
        setResizable(false);
    }
}
