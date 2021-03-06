package org.vashonsd;

import java.util.Arrays;

public class Game {

    char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public Game() {

    }

    public void placePiece(int position, String user) {
        char symbol = 'X';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (char[] row : gameBoard) {
            for (char c : row) {
                result += (c);
            }
            result += "\n";
        }
        return result;




//        return gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]
//                + "\n"
//                + "-------"
//                + "\n"
//                + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]
//                + "\n"
//                + "---------------"
//                + "\n"
//                + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2];
    }
}
