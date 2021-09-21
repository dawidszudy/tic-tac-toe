package pl.pp.tictactoe;

import static pl.pp.tictactoe.Utils.*;

public class Board {

    public static void generateBoardOfFields() {
        number = new String[numberOfFields];
        tableButtons = new ButtonField[numberOfFields];

        for (int j = 0; j < numberOfFields; j++) {
            ButtonField buttonField = new ButtonField(j);
            fieldsPanel.add(buttonField);
            tableButtons[j] = buttonField;
        }
    }

}
