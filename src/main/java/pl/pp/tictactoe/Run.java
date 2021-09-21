package pl.pp.tictactoe;

import java.awt.*;

public class Run {
    public static void main(String[] args) {
        Frame mainFrame = new MainFrame();
        EventQueue.invokeLater(() -> {
            mainFrame.setVisible(true);
        });
    }
}
