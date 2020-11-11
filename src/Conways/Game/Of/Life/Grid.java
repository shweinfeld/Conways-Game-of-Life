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


    public Grid() {

    }

    public void goToNextGeneration() {
        boolean[][] futureArray = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                int aliveNeighbors = calculateAliveNeighbors(i, j);
                futureArray[i][j] = aliveNeighbors != 2 ? aliveNeighbors == 3 : gridArray[i][j];
            }
        }
        gridArray = futureArray;
        increaseGeneration();
    }

    public int calculateAliveNeighbors(int row, int column) {
        int aliveNeighbors = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((row + i) != -1 && (column + j) != -1 && (row + i != row || column + j != column)
                        && row + i != ROW && column + j != COL
                        && gridArray[row + i][column + j]) {
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

    public boolean getCell(int row, int col) {
        return gridArray[row][col];
    }

    public void setCell(int row, int col, boolean value) {
        gridArray[row][col] = value;
    }

    public int getGeneration() {
        return generation;
    }

    public void increaseGeneration() {
        generation++;
    }
}
