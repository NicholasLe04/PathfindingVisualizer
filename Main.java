import javax.swing.Timer;
import java.awt.event.*;

public class Main{
    public static void main(String args[]) throws Exception{
        GUI gui = new GUI();
        
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gui.mazePanel.traversePath();
                gui.repaint();
            }
        };
        Timer timer = new Timer(10 ,taskPerformer);
        timer.start();
    }
}
