import javax.swing.JFrame;

public class GUI extends JFrame{

    MazePanel mazePanel;

    public GUI(){
        mazePanel = new MazePanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(mazePanel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}