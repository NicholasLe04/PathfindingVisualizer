import java.util.ArrayList;
import java.util.Queue;

public class BFS{

    public static void BFSsearch(int[][] grid, int[][] distances, Queue<Position> queue, ArrayList<Integer> path){
        
        if (queue.isEmpty()){
            return;
        }

        Position vertex = queue.poll();

        int dx = 1;
        int dy = 0;
        
        if(grid[vertex.getY() + dy][vertex.getX() + dx] == 0){
            int temp = distances[vertex.getY()][vertex.getX()] + 1;
            System.out.println(temp);
            if (temp < distances[vertex.getY() + dy][vertex.getX() + dx]){
                distances[vertex.getY()][vertex.getX()] = temp;
                System.out.println("path");
            }

            grid[vertex.getY() + dy][vertex.getX() + dx] = -1;
            queue.add(new Position(vertex.getX() + dx, vertex.getY() + dy));

            //path.add(vertex.getX() + dx);
            //path.add(vertex.getY() + dy);
        }

        dx = 0;
        dy = 1;
        
        if(grid[vertex.getY() + dy][vertex.getX() + dx] == 0){
            int temp = distances[vertex.getY() + dy][vertex.getX() + dx] + 1;

            if (temp < distances[vertex.getY()][vertex.getX()]){
                distances[vertex.getY()][vertex.getX()] = temp;
                System.out.println("path");
            }
            
            grid[vertex.getY() + dy][vertex.getX() + dx] = -1;
            queue.add(new Position(vertex.getX() + dx, vertex.getY() + dy));
             
            //path.add(vertex.getX() + dx);
            //path.add(vertex.getY() + dy);
        }

        dx = -1;
        dy = 0;
        
        if(grid[vertex.getY() + dy][vertex.getX() + dx] == 0){
            int temp = distances[vertex.getY() + dy][vertex.getX() + dx] + 1;

            if (temp < distances[vertex.getY()][vertex.getX()]){
                distances[vertex.getY()][vertex.getX()] = temp;
                System.out.println("path");
            }

            grid[vertex.getY() + dy][vertex.getX() + dx] = -1;
            queue.add(new Position(vertex.getX() + dx, vertex.getY() + dy)); 

            //path.add(vertex.getX() + dx);
            //path.add(vertex.getY() + dy);
        }

        dx = 0;
        dy = -1;
        
        if(grid[vertex.getY() + dy][vertex.getX() + dx] == 0){
            int temp = distances[vertex.getY() + dy][vertex.getX() + dx] + 1;

            if (temp < distances[vertex.getY()][vertex.getX()]){
                distances[vertex.getY()][vertex.getX()] = temp;
                System.out.println("path");
            }

            grid[vertex.getY() + dy][vertex.getX() + dx] = -1;
            queue.add(new Position(vertex.getX() + dx, vertex.getY() + dy));

            //path.add(vertex.getX() + dx);
            //path.add(vertex.getY() + dy);
        }

        BFSsearch(grid, distances, queue, path);
    }

}