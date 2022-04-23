package pl.pp.tictactoe;

import javax.swing.*;
import java.awt.*;

public class FieldsPanel extends JFrame {

    private final int rows = 3;
    private final int cols = 3;

    private static final FieldsPanel fieldsPanel = new FieldsPanel();

    public static FieldsPanel getInstance() {
        return fieldsPanel;
    }

    public FieldsPanel() {

        setLayout(new GridLayout(rows, cols));

    }

}
