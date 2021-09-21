package pl.pp.tictactoe;

import javax.swing.*;
import java.awt.*;

import static pl.pp.tictactoe.Board.generateBoardOfFields;
import static pl.pp.tictactoe.Utils.*;

public class MainFrame extends JFrame {

    private JLabel labelText;
    private final int rows = 3;
    private final int cols = 3;

    public MainFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBounds(250, 200, 500, 300);

        generateBoardOfFields();

        labelText = new JLabel(" Teraz ruch:");
        labelPlayer = new JLabel("   krzyżyk");
        JPanel infoPanel = new JPanel();

        infoPanel.add(labelText);
        infoPanel.add(labelPlayer);
        infoPanel.setPreferredSize(new Dimension(150, 150));

        fieldsPanel.setLayout(new GridLayout(rows, cols));
        infoPanel.setLayout(new GridLayout(6, 1));

        add(fieldsPanel);
        add(infoPanel, BorderLayout.EAST);

    }

}
