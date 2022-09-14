import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Maze {
    
    public int size;
    public int[][] grid;
    public ArrayList<Integer> path = new ArrayList<Integer>();
    public ArrayList<Integer> visited = new ArrayList<Integer>();

    public Maze(int size){
        this.size = size;
        this.grid = new int[size][size];
        for (int i = 0; i < size; i++){
            this.grid[i][0] = 1;
            this.grid[0][i] = 1;
            this.grid[i][size - 1] = 1;
            this.grid[size - 1][i] = 1;
        }

        for(int i = 1; i < size - 1; i++){
            for(int j = 1; j < size - 1; j++){
                if (Math.random() > 0.85){
                    grid[i][j] = 1;
                }
                else{
                    grid[i][j] = 0;
                }
            }
        }

        grid[1][1] = 0;
        grid[size-2][size-2] = 9;



        Queue<Position> queue = new ArrayDeque<>();
        queue.add(new Position(1, 1));

        int[][] dist = new int[grid.length][grid.length];
        
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid.length; j++){
                dist[i][j] = 10;
            }
        }
        dist[1][1] = 0;

        DFS.DFSsearch(this.grid, 1, 1, path, visited);
        //BFS.BFSsearch(this.grid, dist, queue, path);
    }
    

}
