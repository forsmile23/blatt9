package maze.model;

public enum Orientation {
    WEST(-1,0),
    EAST(1,0),
    NORTH(0,1),
    SOUTH(0,-1);

    private final int x;
    private final int y;

    Orientation(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){return x;}
    int getY(){return y;}
}
