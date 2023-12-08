package JPanel;

import javax.swing.SwingUtilities;

public class JPanel_Demo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
               Frame frame = new Frame();
            }
            
        });
    }
}
