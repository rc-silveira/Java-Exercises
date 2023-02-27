import java.util.Scanner;

import javax.print.event.PrintEvent;

public class TicTacToe {
    
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("\n*** TIC TAC TOE ***");
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };

        printBoard(board);

        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0) {
                System.out.println("Player 1 Turn: ");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            }
            else{
                System.out.println("Player 2 Turn: ");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);

            int count = checkWin(board);
            if (count == 3) {
                System.out.println("Player 1 wins !");
                break;                
            }
            else if (count == -3)
            {   System.out.println("Player 2 wins");

            }
        }
        
    }

    public static void printBoard(char[][]board){
        System.out.println("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+ " ");
            }
        }
        System.out.println("\n\n");
    }

    public static int[] askUser(char[][] board){
        System.out.println("Pick a Row");
        int row = scan.nextInt();
        System.out.println("Pick a Column");
        int column = scan.nextInt();
       // int spot [][] = new int [column][row];

        while(board[row][column] != ('_')){
            System.out.println("Spot is taken");
            row = scan.nextInt();
            column = scan.nextInt();
        }

        int[] spot = {row, column};
        return spot;
            
        }

    public static int checkWin (char[][] board){
        int count=0;
        for (int i = 0; i < board.length; i++) { //horizontal
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'X'){
                    count ++;
                }
                else if(board[i][j] == 'O'){
                    count --;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
            
        }

        for (int i = 0; i < 3; i++) { //vertical
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] == 'X'){
                    count++;
                }
                else if(board[j][i] == 'O'){
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }


        for (int i = 0; i < 3; i++) { //diagonal
            if(board[i][i] == 'X'){
                count++;
            }
            else if(board[i][i] == 'O'){
                count--;
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }
            for (int i = 0; i < 4; i++) {
                int rowIndex = board[i].length-1 - i;
                if (board[rowIndex][i] == 'X') 
                {
                    count++;
                }
                else if (board[rowIndex][i] == '0') 
                {
                    count--;
                }
            }
        


        return count;
        
    }    
        
    }
    

