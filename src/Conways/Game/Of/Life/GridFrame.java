package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GridFrame extends JFrame {
    public static final int ROWS = 100;
    public static final int COLS = ROWS;
    private JButton[][] cells = new JButton[ROWS][COLS];
    JPanel gridPanel = new JPanel();

    public GridFrame(ActionListener listener) {

        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conways Game of Life");
        setLayout(new FlowLayout());

        gridPanel.setLayout(new GridLayout(ROWS, COLS, 1, 1));
        for(int row = 0; row < cells.length; row++) {
            for(int col = 0; col < cells[row].length; col++) {
                JButton cell = new JButton();
                gridPanel.add(cell);
                cells[row][col] = cell;
                cell.addActionListener(listener);
            }
        }
        add(gridPanel);
    }

    public JButton[][] getButtonGrid(){
        return cells;
    }




}
