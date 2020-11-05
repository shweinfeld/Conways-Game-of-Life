package Conways.Game.Of.Life;

public class Grid {

    /**
     * Instantiates the grid and decides if the cell will be alive
     * or dead in the next generation
     * <p>
     * Author: Jennifer Komendant
     */

    private final int row = 30;
    private final int col = 50;
    private final boolean[][] gridArray = new boolean[row][col];
    private int generation = 0;

    public Grid() {

    }

    public void goToNextGeneration() {
        if (generation == 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    gridArray[row][col] = false;
                }
            }
        }
        else {
            populateGrid();
        }
    }

    public void populateGrid() {
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                int aliveNeighbors = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if (gridArray[i+k][j+l]){
                            aliveNeighbors++;
                        }
                    }
                }
                if(gridArray[i][j] && aliveNeighbors < 2){
                    gridArray[i][j] = false;
                }
                else if(gridArray[i][j] && aliveNeighbors > 3){
                    gridArray[i][j] = false;
                }
                else if(gridArray[i][j] && (aliveNeighbors == 2 || aliveNeighbors == 3)){
                    gridArray[i][j] = true;
                }
                else {
                    gridArray[i][j] = gridArray[i][j];
                }
            }
        }
        generation++;
    }

    public boolean getCells(int row, int col) {
        return gridArray[row][col];
    }

    public void setCells(int row, int col, boolean value) {
        gridArray[row][col] = value;
    }
}
