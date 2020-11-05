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
        //paintLive(g);
        //paintDead(g);
    }

    private void paintGrid(Graphics g) {
        g.setColor(LINE_COLOR);
        //draw vertical grid lines
        for (int x = 0; x < WIDTH; x++) {
            g.fillRect(x * CELL_SIZE, 0, LINE_SIZE, CELL_SIZE * HEIGHT);
        }
        //draw horizontal grid lines
        for (int y = 0; y < HEIGHT; y++) {
            g.fillRect(0 ,y * CELL_SIZE, WIDTH * CELL_SIZE, LINE_SIZE);
        }
    }

}
