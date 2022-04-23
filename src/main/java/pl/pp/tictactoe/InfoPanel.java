package pl.pp.tictactoe;

import javax.swing.*;
import java.awt.*;

import static pl.pp.tictactoe.Utils.*;

public class InfoPanel extends JPanel {

    private static final InfoPanel infoPanel = new InfoPanel();
    private JLabel labelText;

    public static InfoPanel getInstance() {
        return infoPanel;
    }

    public InfoPanel() {
        labelText = new JLabel(" Now move:");
        labelPlayer = new JLabel("   cross");

        add(labelText);
        add(labelPlayer);
        setPreferredSize(new Dimension(150, 150));

        setLayout(new GridLayout(6, 1));
    }

}
