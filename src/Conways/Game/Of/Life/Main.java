package Conways.Game.Of.Life;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        JButton nextButton = new JButton();
        JButton clearButton = new JButton();
        Grid grid = new Grid();
        GridView view = new GridView(grid);
        GridMouseListener listener = new GridMouseListener(grid);
        GridFrame frame = new GridFrame(listener, view, nextButton, clearButton);
        frame.setVisible(true);
    }
}