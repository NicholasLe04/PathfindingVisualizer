public class Position {
    
    private int row;
    private int col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getX(){
        return col;
    }
    
    public int getY(){
        return row;
    }


}
