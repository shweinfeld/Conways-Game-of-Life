package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
    Grid grid;
    JButton nextButton;
    JButton clearButton;
    JPanel bottom = new JPanel();


    public GridFrame(MouseListener listener, GridView gridView, JButton nextButton, JButton clearButton) {

        //encapsulate?
        this.grid = gridView.grid;
        this.nextButton = nextButton;
        this.clearButton = clearButton;

        setSize(1000, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setLayout(new BorderLayout());

        gridView.addMouseListener(listener);
        add(gridView, BorderLayout.CENTER);
        bottom.setLayout(new FlowLayout());
        clearButton.setText("Clear");
        clearButton.addActionListener(ActionEvent -> {grid.clearGrid(); gridView.repaint();});
        bottom.add(clearButton);
        nextButton.setText("Next");
        nextButton.addActionListener(ActionEvent -> {grid.goToNextGeneration(); gridView.repaint();});
        bottom.add(nextButton);
        add(bottom, BorderLayout.SOUTH);

    }

}
