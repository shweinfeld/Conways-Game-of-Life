package Conways.Game.Of.Life;

import java.util.Arrays;

public class Grid {

    /**
     * Instantiates the grid and decides if the cell will be alive
     * or dead in the next generation
     * <p>
     * Author: Jennifer Komendant
     */

    private final int ROW = 50;
    private final int COL = 30;
    private final boolean[][] gridArray = new boolean[ROW][COL];
    private int generation = 0;


    public Grid() {

    }

    public void goToNextGeneration() {
        for (int i = 0; i < ROW - 1; i++) {
            for (int j = 0; j < COL - 1; j++) {
                int aliveNeighbors = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if ((i+k)!= -1 && (j+l) !=-1 && gridArray[i + k][j + l]) {
                            aliveNeighbors++;
                        }
                    }
                }
                if (gridArray[i][j] && aliveNeighbors < 2) {
                    gridArray[i][j] = false;
                } else if (gridArray[i][j] && aliveNeighbors > 3) {
                    gridArray[i][j] = false;
                } else if (gridArray[i][j] && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
                    gridArray[i][j] = true;
                } else {
                    gridArray[i][j] = gridArray[i][j];
                }
            }
        }
        increaseGeneration();
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
