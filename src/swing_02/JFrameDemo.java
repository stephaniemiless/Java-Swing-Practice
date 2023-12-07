package swing_02;

import javax.swing.SwingUtilities;

public class JFrameDemo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame1 frame1 = new JFrame1();
            }
            
        });
    }
}
