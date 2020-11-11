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
    private static final Color LIVE_COLOR = Color.ORANGE;
    private static final Color DEAD_COLOR = Color.GRAY;
    private final Grid grid;

    public GridView(Grid grid) {
        this.grid = grid;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintLifeStatus(g);

    }

    public Grid getGrid() {
        return grid;
    }

    private void paintLifeStatus(Graphics g) {

        for (int i = 0; i < Grid.ROW; i++) {
            for (int j = 0; j < Grid.COL; j++) {
               g.setColor(grid.getCell(i,j)? LIVE_COLOR : DEAD_COLOR);
                g.fillRect(i * BORDERED_CELL_SIZE, j * BORDERED_CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }
}
