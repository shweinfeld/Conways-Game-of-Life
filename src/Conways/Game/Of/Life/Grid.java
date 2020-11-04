package Conways.Game.Of.Life;

public class Grid {

    /**
     *
     * Instantiates the grid and decides if the cell will be alive
     * or dead in the next generation
     *
     * Author: Chashie Komendant
     */

    private final int row = 30;
    private final int col = 50;
    private final boolean[][] gridArray = new boolean[row][col];

    public Grid() {

    }

    public void populateGrid(){

    }

    public void goToNextGeneration(){

    }

    public boolean getCells(int row, int col){
        return gridArray[row][col];
    }

    public void setCells(int row, int col, boolean value){
        gridArray[row][col] = value;
    }
}
