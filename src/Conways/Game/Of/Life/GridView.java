package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

/**
 * Populates the grid visual
 * <p>
 * Author: Ricki Peikes
 */

public class GridView extends JComponent {

    //private final Grid grid;
    public static final int CELL_SIZE = 10;
    public static final int LINE_SIZE = 1;
    public static final int HEIGHT = 30;
    public static final int WIDTH = 50;
    public static final Color LIVE_COLOR = Color.ORANGE;
    public static final Color DEAD_COLOR = Color.GRAY;
    public static final Color LINE_COLOR = Color.BLACK;
    Grid grid;
    boolean[][] squares;

    public GridView(Grid grid) {
        this.grid = grid;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
        paintLifeStatus(g);
    }

    private void paintLifeStatus(Graphics g) {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                //not sure why ternary wasn't working
                if (grid.getCells(i, j)) {
                    g.setColor(LIVE_COLOR);
                } else {
                    g.setColor(DEAD_COLOR);
                }
            }
        }
    }

    private void paintGrid(Graphics g) {

        //draw vertical grid lines
        for (int x = 0; x < WIDTH; x++) {
            g.setColor(LINE_COLOR);
            g.fillRect(x * CELL_SIZE, 0, LINE_SIZE, CELL_SIZE * HEIGHT);
            g.setColor(DEAD_COLOR);
            for (int i = 0; i < HEIGHT; i++) {
                g.fillRect(x * CELL_SIZE + 1, i * CELL_SIZE + 1, LINE_SIZE, CELL_SIZE * HEIGHT);
            }
        }

        //draw horizontal grid lines
        for (int y = 0; y < HEIGHT; y++) {
            g.setColor(LINE_COLOR);
            g.fillRect(0, y * CELL_SIZE, WIDTH * CELL_SIZE, LINE_SIZE);
        }
    }

}
