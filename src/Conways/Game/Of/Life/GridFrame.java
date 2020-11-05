package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {


    public GridFrame(
            Grid grid,
            GridView gridView,
            JButton nextButton
    ) {
        setSize(650, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setLayout(new BorderLayout());

        add(gridView, BorderLayout.CENTER);
        nextButton.addActionListener(ActionEvent -> {getNextGen(grid);});

    }

    private void getNextGen(Grid grid) {
        grid.goToNextGeneration();
    }
}
