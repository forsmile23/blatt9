package maze.model;

import maze.model.Maze;
import maze.model.MazeException;
import maze.model.Orientation;
import maze.model.TurnDir;

public class Walker {
    private Orientation o;
    private final Maze maze;
    private int x;
    private int y;

    Walker(int x, int y, Orientation o, Maze maze) throws MazeException {
        if(!maze.isAccessible(x,y)) throw new MazeException(" ");
        this.o = o;
        this.maze = maze;
        this.x = x;
        this.y = y;
    }
    void turn(TurnDir turnDir){
        if(o == Orientation.NORTH){
            if(turnDir == TurnDir.RIGHT) o = Orientation.EAST;
            else o = Orientation.WEST;
        }

        if(o == Orientation.WEST){
            if(turnDir == TurnDir.RIGHT) o = Orientation.NORTH;
            else o = Orientation.SOUTH;
        }

        if(o == Orientation.SOUTH){
            if(turnDir == TurnDir.RIGHT) o = Orientation.WEST;
            else o = Orientation.EAST;
        }

        if(o == Orientation.EAST){
            if(turnDir == TurnDir.RIGHT) o = Orientation.SOUTH;
            else o = Orientation.NORTH;
        }
    }
    boolean canWalk(){
        return maze.isAccessible(x + o.getX(), y + o.getY());
    }
    void walk()throws MazeException{
        if(maze.isAccessible(x + o.getX(), y + o.getY())) throw new MazeException(" ");
        else{
            x = x + o.getX();
            y = y + o.getY();
        }
    }
    void print(int range){}
}
