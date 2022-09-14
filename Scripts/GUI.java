import javax.swing.JFrame;

public class GUI extends JFrame{

    MazePanel mazePanel;

    public GUI(){
        mazePanel = new MazePanel(800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(mazePanel);
        this.pack();

        this.setTitle("Pathfinding Visualizer by Nicholas Le");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}