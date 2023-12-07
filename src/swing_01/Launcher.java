package swing_01;

import javax.swing.SwingUtilities;

public class Launcher {

    //all swing code has to run in the SAME thread
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();
            }
            
        });
    }
}
