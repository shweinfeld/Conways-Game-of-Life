package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
    Grid grid;
    JButton nextButton;
    JButton clearButton;
    JPanel bottom = new JPanel();

    public GridFrame(GridView gridView, JButton nextButton, JButton clearButton) {

        //encapsulate?
        this.grid = gridView.grid;
        this.nextButton = nextButton;
        this.clearButton = clearButton;
        setSize(1000, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setLayout(new BorderLayout());

        add(gridView, BorderLayout.CENTER);
        bottom.setLayout(new FlowLayout());
        clearButton.setText("Clear");
        bottom.add(clearButton);
        nextButton.setText("Next");
        bottom.add(nextButton);
        add(bottom, BorderLayout.SOUTH);
        nextButton.addActionListener(ActionEvent -> {
            getNextGen(grid);
        });

    }

    private void getNextGen(Grid grid) {
        grid.goToNextGeneration();
    }
}
