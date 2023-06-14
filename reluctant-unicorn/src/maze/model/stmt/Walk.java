package maze.model.stmt;
import maze.model.MazeException;


public class Walk implements Stmt {
    Walk() throws MazeException {
        if(!canWalk()) throw new MazeException(" ");
    }
}
