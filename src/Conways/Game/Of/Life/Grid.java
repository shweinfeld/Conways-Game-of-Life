package Conways.Game.Of.Life;

public class Grid {

    /**
     * Instantiates the grid and decides if the cell will be alive
     * or dead in the next generation
     * <p>
     * Author: Jennifer Komendant
     */

    private final int ROW = 50;
    private final int COL = 30;
    private boolean[][] gridArray = new boolean[ROW][COL];
    private int generation = 0;
    private int aliveNeighbors = 0;


    public Grid() {

    }

    public void goToNextGeneration() {
        boolean[][] futureArray = new boolean[ROW][COL];
        for (int i = 0; i < ROW - 1; i++) {
            for (int j = 0; j < COL - 1; j++) {
                aliveNeighbors = calculateAliveNeighbors(aliveNeighbors, i, j);
                if (gridArray[i][j] && (aliveNeighbors < 2) || aliveNeighbors > 3) {
                    futureArray[i][j] = false;
                } else if (gridArray[i][j] && aliveNeighbors == 3) {
                    futureArray[i][j] = true;
                } else {
                    futureArray[i][j] = gridArray[i][j];
                }
                aliveNeighbors = 0;
            }
        }
        gridArray = futureArray;
        increaseGeneration();
    }

    public int calculateAliveNeighbors(int aliveNeighbors, int row, int column){
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((row+i)!= -1 && (column+j) !=-1 && gridArray[row + i][column + j]) {
                    aliveNeighbors++;
                }
            }
        }
        return aliveNeighbors;
    }

    public void clearGrid() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                gridArray[i][j] = false;
            }
        }
        generation = 0;
    }

    public boolean getCells(int row, int col) {
        return gridArray[row][col];
    }

    public void setCells(int row, int col, boolean value) {
        gridArray[row][col] = value;
    }

    public int getGeneration() {
        return generation;
    }

    public void increaseGeneration() {
        generation++;
    }
}
