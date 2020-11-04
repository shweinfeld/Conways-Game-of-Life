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

    public GridView(Grid grid) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
        paintLive(g);
        paintDead(g);

    }

    //Changes color of cells that don't have sufficient neighbors
    private void paintDead(Graphics g) {
    }

    private void paintLive(Graphics g) {
    }

    private void paintGrid(Graphics g) {
    }

}

