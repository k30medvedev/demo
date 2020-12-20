package deiteiPJCourse.loops.game2;

import java.util.ArrayList;
import java.util.List;

public class CleanCode {

    public static final int STATUS_VALUE = 0 ;
    public static final int FLAGGED = 4 ;
    public static int [][] gameBoard ={{4,4},{4,5},{1,1},{2,2},{4,5},{6,7},{0,1},{0,7}};

    public List<int[]> flaggedCells() {
    List<int[]> flaggedCells = new ArrayList<int[]>();
    for (int[]cell : gameBoard)
        if(cell[STATUS_VALUE]== FLAGGED)
            flaggedCells.add(cell);
    return flaggedCells;
    }


    public static void main(String[] args) {
        CleanCode cleanCode = new CleanCode();
        System.out.println(cleanCode.flaggedCells());


    }
}
