package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
    Grid grid;
    JButton nextButton;
    JButton clearButton;
    JPanel bottom = new JPanel();
    GridView view;
    JButton playButton;
    boolean play = false;


    public GridFrame(GridMouseListener listener, GridView gridView, JButton nextButton, JButton clearButton) {

        //encapsulate?
        this.grid = gridView.getGrid();
        this.nextButton = nextButton;
        this.clearButton = clearButton;
        this.view = gridView;
        this.playButton = new JButton("Play/Pause");

        setSize(1000, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setLayout(new BorderLayout());

        gridView.addMouseListener(listener);
        add(gridView, BorderLayout.CENTER);
        bottom.setLayout(new FlowLayout());
        clearButton.setText("Clear");
        clearButton.addActionListener(ActionEvent -> clearBoard());
        bottom.add(clearButton);
        nextButton.setText("Next");
        playButton.addActionListener(ActionEvent -> playLoop());
        bottom.add(playButton);
        nextButton.addActionListener(ActionEvent -> displayNextGen());
        bottom.add(nextButton);
        bottom.add(playButton);
        add(bottom, BorderLayout.SOUTH);

    }

    private void displayNextGen() {
        if (!play) {
            grid.goToNextGeneration();
            view.repaint();
        }

    }

    private void clearBoard() {
        play = false;
        grid.clearGrid();
        view.repaint();
    }

    private void playLoop() {
        play = !play;
        Thread thread = new Thread(() -> {
            while (play) {
                grid.goToNextGeneration();
                view.repaint();
                try {
                    Thread.sleep(125);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

}
