package maze.model;

public class SimpleMaze implements Maze{
    private final int size;

    SimpleMaze(int size){
        this.size = size;
    }

    @Override
    public boolean isAccessible(int x, int y) {
        if(x <= size && y <= size){
            if(x >= 0 && y >= 0){
                return true;
            }
        }
        return false;
    }
}
