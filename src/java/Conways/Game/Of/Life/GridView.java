package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

/**
 * Populates the grid visual
 * <p>
 * Author: Ricki Peikes
 */

public class GridView extends JComponent {

    public static final int CELL_SIZE = 15;
    public static final int BORDERED_CELL_SIZE = 17;
    public static final int HEIGHT = 30;
    public static final int WIDTH = 50;
    private final Color LIVE_COLOR = Color.ORANGE;
    private final Color DEAD_COLOR = Color.GRAY;
    Grid grid;

    public GridView(Grid grid) {
        this.grid = grid;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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
                g.fillRect(i * BORDERED_CELL_SIZE, j * BORDERED_CELL_SIZE, CELL_SIZE, CELL_SIZE);
                //System.out.println(i * BORDERED_CELL_SIZE);
            }
        }
    }
}
