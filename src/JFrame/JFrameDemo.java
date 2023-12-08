package JFrame;

import javax.swing.SwingUtilities;

public class JFrameDemo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //JFrame1 frame1 = new JFrame1();
                
                JFrame2 frame2 = new JFrame2();
                //bc initialize is private, user cannot access it
            }
            
        });
    }
}
