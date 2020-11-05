package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import static Conways.Game.Of.Life.GridView.BORDERED_CELL_SIZE;
import static Conways.Game.Of.Life.GridView.CELL_SIZE;

public class MouseListener implements java.awt.event.MouseListener {
    private final Grid grid;
    private GridView view;


    public MouseListener(Grid grid, GridView view) {
        this.grid = grid;
        this.view = view;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getX();
        int col = e.getY();
        int rowIndex = (int)(row / BORDERED_CELL_SIZE);
        int colIndex = (int)(col/ BORDERED_CELL_SIZE);
        System.out.println(rowIndex);

        if (grid.getCells(rowIndex, colIndex)) {
            grid.setCells(rowIndex, colIndex, false);
            view.repaint();
        }
        else {
            grid.setCells(rowIndex, colIndex, true);
            view.repaint();
        }
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
