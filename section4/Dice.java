package section4;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        //Numbers
        Scanner scanned = new Scanner(System.in);
        System.out.println("Pick your numbers\n");
        int firstNumber = scanned.nextInt();
        int secondNumber = scanned.nextInt();
        int thirdNumber = scanned.nextInt();

        if(firstNumber < 1 || secondNumber < 1 || thirdNumber < 1){
            System.out.println( " :( ");
            System.exit(0);
        }

        if(firstNumber > 6 || secondNumber > 6  || thirdNumber > 6 ){
            System.out.println( " :( ");
            System.exit(0);
        }

        

        System.out.println("\nNumber 1 = "+ firstNumber + "\nNumber 2 = " + secondNumber + "\nNumber 3 = " + thirdNumber);
        int totalNumbers = firstNumber + secondNumber + thirdNumber;
        System.out.println(totalNumbers);
        
        
        //Dice 
        int firstDice = RollTheDice();
        int secondDice = RollTheDice();
        int thirdDice = RollTheDice();

        int totalDices = firstDice + secondDice + thirdDice;

        System.out.println("\nfirstDice = "+ firstDice + "\nsecondDice = " + secondDice + "\nthirdDice = " + thirdDice);
        System.out.println(totalDices);  

        if(checkWinner(totalDices, totalNumbers)){
            System.out.println(" :) ");
        }

        else System.out.println( " :( ");

        scanned.close();
        
    }

    public static boolean checkWinner(int totalDices,int totalNumbers ){

        return(totalDices < totalNumbers && totalDices - totalNumbers < 3 );
         

    }


    public static int RollTheDice(){
        int num = (int) (1 + (Math.random() * 6));

        return num;
    }
}
