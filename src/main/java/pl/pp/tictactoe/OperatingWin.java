package pl.pp.tictactoe;

import static pl.pp.tictactoe.Utils.*;

public class OperatingWin {

    private MessageWindow messageWindow = new MessageWindow();

    public void checkWin() {
        for (int i = 0; i < 8; i++) {
            generateWinnerMessage(i);
        }
        checkTieInTheGame();
    }

    private void checkTieInTheGame() {
        if ( numberClickCrossOrWheel == numberOfFields ) {
            messageWindow.showMessage("Remis!");
            resetGame();
        }
    }

    private void generateWinnerMessage(int i) {
        String line = checkAreFieldsWin(i);

        if ( line.equals("XXX") ) {
            messageWindow.showMessage("Wygrana gracza krzyżyk!");
            resetGame();
            labelPlayer.setText("   kółko");
        } else if ( line.equals("OOO") ) {
            messageWindow.showMessage("Wygrana gracza kółko!");
            resetGame();
            labelPlayer.setText("   krzyżyk");
        }

    }

    private void resetGame() {
        for (int j = 0; j < numberOfFields; j++) {
            tableButtons[j].setText("");
            tableButtons[j].setNoClickField(true);
            number[j] = "";
            numberClickCrossOrWheel = 0;
        }
    }

    private String checkAreFieldsWin(int i) {

        String line = "";

        switch (i) {
            case 0:
                line = number[0] + number[1] + number[2];
                break;
            case 1:
                line = number[3] + number[4] + number[5];
                break;
            case 2:
                line = number[6] + number[7] + number[8];
                break;
            case 3:
                line = number[0] + number[3] + number[6];
                break;
            case 4:
                line = number[1] + number[4] + number[7];
                break;
            case 5:
                line = number[2] + number[5] + number[8];
                break;
            case 6:
                line = number[0] + number[4] + number[8];
                break;
            case 7:
                line = number[2] + number[4] + number[6];
                break;
        }
        return line;
    }

}
