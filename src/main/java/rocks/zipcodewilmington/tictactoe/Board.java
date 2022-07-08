package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix=matrix;
    }

    public Boolean isInFavorOfX() {

        for (int i = 0; i <= 9; i++) { //iterating through each turn....
            if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X') { //toprow
                return true;
            } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') { //middlerow
                return true;
            } else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') { //bottom
                return true;
            } else if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') { //leftside
                return true;
            } else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') { //middle
                return true;
            } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') { //rightside
                return true;
            } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') { //diagonals
                return true;
            } else if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') { //diagonals
                return true;
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i <= 9; i++) {
            if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
                return true;
            } else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') {
                return true;
            } else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
                return true;
            } else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') {
                return true;
            } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
                return true;
            } else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
                return true;
            } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
                return true;
            } else if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
                return true;
            }
        }
        return false;
    }

    public Boolean isTie() {

        if (isInFavorOfX() || isInFavorOfO()) {

            return false;
        } else {
            return true;
        }
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";

        } else if (isInFavorOfO()) {
            return "O";

        } else
            return "";
    }

}
