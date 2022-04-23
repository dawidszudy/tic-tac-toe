package pl.pp.tictactoe;

import javax.swing.*;
import java.awt.*;

import static pl.pp.tictactoe.Board.generateBoardOfFields;
import static pl.pp.tictactoe.Utils.*;

public class MainFrame extends JFrame {

    private final int rows = 3;
    private final int cols = 3;

    public MainFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBounds(250, 200, 500, 300);

        generateBoardOfFields();

        fieldsPanel.setLayout(new GridLayout(rows, cols));

        add(fieldsPanel);
        add(InfoPanel.getInstance(), BorderLayout.EAST);

    }

}
