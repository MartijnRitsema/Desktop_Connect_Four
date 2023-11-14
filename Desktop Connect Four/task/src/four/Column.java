package four;

import static four.ConnectFour.COLUMNS;
import static four.ConnectFour.ROWS;

public class Column {

    protected Cell[] cells = new Cell[ROWS];
    protected int row;

    protected void setCells(int row, Cell cell) {
        cells[row] = cell;
    }

    protected void setColumnText(String currentPlayer) {
        for (int i = 0; i < ROWS; i++) {
            if (cells[i].getText().equals(" ")) {
                cells[i].setText(currentPlayer);
                break;
            }
        }
        Cell.checkWin();
    }
}