package pl.pp.tictactoe;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static pl.pp.tictactoe.Utils.*;

public class ButtonField extends JButton {

    private static boolean playerCross = true;
    private static boolean playerWheel = false;

    private final int fieldNumber;
    private boolean noClickField = true;
    private OperatingWin operatingWin = new OperatingWin();

    public ButtonField(int fieldNumber) {
        this.fieldNumber = fieldNumber;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                int button = mouseEvent.getButton();

                if ( button == MouseEvent.BUTTON1 ) {

                    conditionButton(fieldNumber);

                    noClickField = false;

                    operatingWin.checkWin();
                }
            }

        });
    }

    private void conditionButton(int fieldNumber) {
        if ( playerCross && !playerWheel && noClickField ) {
            setText("X");
            number[fieldNumber] = "X";
            playerCross = false;
            playerWheel = true;
            labelPlayer.setText("   circle");
            numberClickCrossOrWheel++;
        } else if ( !playerCross && playerWheel && noClickField ) {
            setText("O");
            number[fieldNumber] = "O";
            playerCross = true;
            playerWheel = false;
            labelPlayer.setText("   cross");
            numberClickCrossOrWheel++;
        }
    }

    public void setNoClickField(boolean noClickField) {
        this.noClickField = noClickField;
    }

}
