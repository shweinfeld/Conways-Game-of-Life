package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import static Conways.Game.Of.Life.GridView.CELLSIZE;

public class MouseListener implements java.awt.event.MouseListener {
    private final Grid grid;


    public MouseListener(Grid grid) {
        this.grid = grid;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getX();
        int col = e.getY();
        int rowIndex = (int)(row / CELLSIZE);
        int colIndex = (int)(col/ CELLSIZE);

        if (grid.getCells(rowIndex, colIndex)) {
            grid.setCells(rowIndex, colIndex, false);
        }
        else {
            grid.setCells(rowIndex, colIndex, true);
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
