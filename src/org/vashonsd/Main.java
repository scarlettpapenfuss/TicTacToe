package org.vashonsd;

import java.util.*;

public class Main {


    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        Game thisGame = new Game();
        System.out.println(thisGame);
        System.out.println("What is your first move?");
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();
        thisGame.placePiece(position, "user");
        System.out.println(thisGame);
        //create layout for game board
//        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
//                {' ', '|', ' ', '|', ' '},
//                {'-', '+', '-', '+', '-'},
//                {' ', '|', ' ', '|', ' '},
//                {'-', '+', '-', '+', '-'},
//                {' ', '|', ' ', '|', ' '}};
//        //print game board
//        System.out.println(gameBoard);
//
//        Scanner scan = new Scanner(System.in);
//        while (true) {
//            scan = new Scanner(System.in);
//            System.out.println("Enter your placement (1-9):");
//            int playerPosition = scan.nextInt();
//            int cpuPosition = 0;
//            while (playerPositions.contains(playerPosition) || cpuPosition.contains(playerPosition)) {
//                System.out.println("Position taken, please enter a corect position.");
//                playerPosition = scan.nextInt();
//            }
//
//            placePiece(gameBoard, playerPosition, "player");
//
//            Random rand = new Random();
//            cpuPosition = rand.nextInt(9) + 1;
//            while (playerPositions.contains(cpuPosition) || playerPositions.contains(cpuPosition)) {
//                System.out.println("Position taken, please enter a corect position.");
//                playerPosition = scan.nextInt();
//                placePiece(gameBoard, cpuPosition, "cpu");
//
//                printGameBoard(gameBoard);
//
//                String result = checkWinner();
//                System.out.println(result);
//
//            }
//
//
//        }
//
//
//        }
//    private static void placePiece(char[][] gameBoard, int cpuPosition, String user) {
//        switch (cpuPosition) {
//            char symbol = 'X';
//            if (user.equals("player")) {
//                symbol = 'X';
//                playerPositions.add(cpuPosition);
//            } else if (user.equals("cpu")) {
//                symbol = 'O';
//                cpuPosition.add(playerPositions);
//            }
//
//            case 1:
//                gameBoard[0][0] = symbol;
//                break;
//            case 2:
//                gameBoard[0][2] = symbol;
//                break;
//            case 3:
//                gameBoard[0][4] = symbol;
//                break;
//            case 4:
//                gameBoard[2][0] = symbol;
//                break;
//            case 5:
//                gameBoard[2][2] = symbol;
//                break;
//            case 6:
//                gameBoard[2][4] = symbol;
//                break;
//            case 7:
//                gameBoard[4][0] = symbol;
//                break;
//            case 8:
//                gameBoard[4][2] = symbol;
//                break;
//            case 9:
//                gameBoard[4][4] = symbol;
//                break;
//            default:
//
//        }
//    }
//
//
//
//    private static void printGameBoard(char[][] gameBoard) {
//        for (char[] row : gameBoard) {
//            for (char c : row) {
//                System.out.println(c);
//            }
//            System.out.println();
//        }
//    }
//
//
//
//    private static String checkWinner() {
//        List topRow = Arrays.asList(1, 2, 3);
//        List middleRow = Arrays.asList(4, 5, 6);
//        List bottomRow = Arrays.asList(7, 8, 9);
//        List leftCol = Arrays.asList(1, 4, 7);
//        List middleCol = Arrays.asList(2, 5, 8);
//        List rightCol = Arrays.asList(3, 6, 9);
//        List cross1 = Arrays.asList(1, 5, 9);
//        List cross2 = Arrays.asList(7, 5, 3);
//
//        List<List> winning = new ArrayList<List>();
//        winning.add(topRow);
//        winning.add(middleRow);
//        winning.add(bottomRow);
//        winning.add(leftCol);
//        winning.add(middleCol);
//        winning.add(rightCol);
//        winning.add(cross1);
//        winning.add(cross2);
//
//        for (List l : winning) {
//            if (playerPositions.containsAll(l)) {
//                System.out.println("Congratualations you won!");
//            } else if (cpuPositions.containsAll(l)) {
//                System.out.println("CPU wins!");
//            } else if (playerPositions.size() == cpuPosition.size()) {
//                System.out.println("It's a tie");
//            }
//        }
//
//        return "";
    }
    }

