package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ButtonListener implements ActionListener {
    private final Grid grid;
    private final GridFrame frame;


    public ButtonListener(Grid grid, GridFrame frame) {
        this.grid = grid;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int row = 0; row < GridFrame.ROWS; row++) {
            for (int col = 0; col < GridFrame.COLS; col++) {
                if (frame.getButtonGrid()[row][col] ==  e.getSource()) {
                    if (grid.getCells(row, col) == true) {
                        grid.setCells(row, col, false);
                    }
                    else {
                        grid.setCells(row, col, true);
                    }
                }
            }
        }

    }
}
