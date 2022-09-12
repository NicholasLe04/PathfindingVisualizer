import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;

public class MazePanel extends JPanel{

    Maze maze = new Maze(32);
    Random random = new Random();
    int pathIndex = maze.path.size() - 1;

    MazePanel(){
        this.setPreferredSize(new Dimension(800, 800));
    }
    
    public void traversePath(){
        if (pathIndex > 0){
            int x = maze.path.get(pathIndex - 1);
            int y = maze.path.get(pathIndex);
    
            maze.grid[y][x] = 3;
            pathIndex -= 2;
        }
        
    }

    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        super.paintComponent(g2);

        for (int i = 0; i < maze.size; i++){
            for (int j = 0; j < maze.size; j++){
                switch(maze.grid[i][j]){
                    case 1:
                        g2.setColor(Color.BLACK);
                        break;
                    //case 2:
                      //  g2.setColor(Color.GRAY);
                        //break; 
                    case 3:
                        g2.setColor(Color.GREEN);
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
