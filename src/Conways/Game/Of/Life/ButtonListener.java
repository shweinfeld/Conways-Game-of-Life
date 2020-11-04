package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ButtonListener implements ActionListener {
    private final Grid grid;
    private final GridView view;


    public ButtonListener(Grid grid, GridView view) {
        this.grid = grid;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int row = 0; row < grid.getHeight(); row++) {
            for (int col = 0; col < grid.getWidth(); col++) {
                if (view.getButtonGrid[row][col] ==  e.getSource()) {
                    if (grid.getCell(row, col) == true) {
                        grid.setCell(row, col, false);
                    }
                    else {
                        grid.setCell(row, col, true);
                    }
                }
            }
        }

    }
}
