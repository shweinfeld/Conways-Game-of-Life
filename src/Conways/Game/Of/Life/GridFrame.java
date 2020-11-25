package Conways.Game.Of.Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GridFrame extends JFrame {
    Grid grid;
    JButton nextButton;
    JButton clearButton;
    JButton playButton;
    JPanel bottom = new JPanel();
    GridView view;


    public GridFrame(GridMouseListener listener, GridView gridView, JButton nextButton, JButton clearButton) {

        //encapsulate?
        this.grid = gridView.getGrid();
        this.nextButton = nextButton;
        this.clearButton = clearButton;
        this.view = gridView;
        this.playButton = new JButton();

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
        playButton.setText("Play");
        playButton.addActionListener(ActionEvent -> playLoop());
        bottom.add(nextButton);
        bottom.add(playButton);
        add(bottom, BorderLayout.SOUTH);

    }

    private void playLoop(){

        Thread thread = new Thread(() -> {
            while (true){
                grid.goToNextGeneration();
                view.repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

    }

}
