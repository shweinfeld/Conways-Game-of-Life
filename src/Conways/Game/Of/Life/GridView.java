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
    public static final int HEIGHT = 30;
    public static final int WIDTH = 50;
    public static final Color LIVE_COLOR = Color.WHITE;
    public static final Color DEAD_COLOR = Color.BLACK;
    int[][] squares;
    public GridView(Grid grid) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
        //paintLive(g);
        //paintDead(g);
    }

    private void paintGrid(Graphics g) {

    }

}

