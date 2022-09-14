import java.util.ArrayList;

public class DFS {
    
    public static boolean DFSsearch(int[][] grid, int start_x, int start_y, ArrayList<Integer> path, ArrayList<Integer> visited){
        if (grid[start_y][start_x] == 9){
            return true;
        }

        if (grid[start_y][start_x] == 0){
            // -1: Visited
            grid[start_y][start_x] = -1;
            visited.add(start_x);
            visited.add(start_y);

            int delta_x = -1;
            int delta_y = 0;
            if(DFSsearch(grid, start_x + delta_x, start_y + delta_y, path, visited)){
                path.add(start_x);
                path.add(start_y);
                return true;
            }

            delta_x = 1;
            delta_y = 0;
            if(DFSsearch(grid, start_x + delta_x, start_y + delta_y, path, visited)){
                path.add(start_x);
                path.add(start_y);
                return true;
            }

            delta_x = 0;
            delta_y = -1;
            if(DFSsearch(grid, start_x + delta_x, start_y + delta_y, path, visited)){
                path.add(start_x);
                path.add(start_y);
                return true;
            }

            delta_x = 0;
            delta_y = 1;
            if(DFSsearch(grid, start_x + delta_x, start_y + delta_y, path, visited)){
                path.add(start_x);
                path.add(start_y);
                return true;
            }
        }
        return false;
    }

}   
