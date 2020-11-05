package Conways.Game.Of.Life;

import java.awt.event.MouseEvent;

import static Conways.Game.Of.Life.GridView.BORDERED_CELL_SIZE;


public class MouseListener implements java.awt.event.MouseListener {
    private final Grid grid;


    public MouseListener(Grid grid) {
        this.grid = grid;

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getX();
        int col = e.getY();
        int rowIndex = row / BORDERED_CELL_SIZE;
        int colIndex = col/ BORDERED_CELL_SIZE;

        grid.setCells(rowIndex, colIndex, !grid.getCells(rowIndex, colIndex));
        e.getComponent().repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
