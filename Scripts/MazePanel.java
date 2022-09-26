import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.Timer;

public class MazePanel extends JPanel{

    Maze maze = new Maze(32);
    Random random = new Random();
    int pathIndex = 0;
    int visitedIndex = 0;
    Timer visitTimer;
    Timer pathTimer;

    MazePanel(int resolution){
        this.setPreferredSize(new Dimension(resolution, resolution));
    }


    public void visualize() throws InterruptedException{
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (visitedIndex < maze.visited.size()-1){
                    int x = maze.visited.get(visitedIndex);
                    int y = maze.visited.get(visitedIndex + 1);
            
                    maze.grid[y][x] = 2;
                    visitedIndex += 2;
                }
                repaint();
            }
        };
        visitTimer = new Timer(10 ,taskPerformer);
        visitTimer.start();
        Thread.sleep(6 * maze.visited.size());
        traversePath();
    }
    
    public void traversePath(){
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (pathIndex < maze.path.size()-1){
                    int x = maze.path.get(pathIndex);
                    int y = maze.path.get(pathIndex + 1);
            
                    maze.grid[y][x] = 3;
                    pathIndex += 2;
                }
                repaint();
            }
        };
        pathTimer = new Timer(3 ,taskPerformer);
        pathTimer.start();
    }

    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        super.paintComponent(g2);

        for (int i = 0; i < maze.size; i++){
            for (int j = 0; j < maze.size; j++){
                /*
                 * 1 = Wall
                 * 2 = Checked
                 * 3 = Path
                 * 9 = Goal
                 * 0 = Open
                 */
                switch(maze.grid[i][j]){
                    case 1:
                        g2.setColor(Color.BLACK);
                        break;
                    case 2:
                        g2.setColor(Color.GRAY);
                        break;
                    case 3:
                        g2.setColor(Color.GREEN);
                        break;
                    case 4:
                        g2.setColor(Color.BLACK);
                        break;
                    case 9: 
                        g2.setColor(Color.RED);
                        break;
                    default:
                        g2.setColor(Color.WHITE);
                        break;
                }
                g2.fillRect(25 * j, 25 * i, 25, 25);
            }
        }
    }
}
