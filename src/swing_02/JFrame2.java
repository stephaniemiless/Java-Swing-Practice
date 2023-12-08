package swing_02;

import javax.swing.JFrame;

//best practice, we want to restrict access to the user
public class JFrame2 {
    
    private JFrame frame;

    public JFrame2() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        this.frame.setTitle("JFrame2");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closes entire application
        this.frame.setSize(500, 400);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null); //appears in the center
        this.frame.setResizable(false);
    }
}
