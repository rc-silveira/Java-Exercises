package section4;

import java.util.Random;
import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {

        //Scanner scanned = new Scanner((System.in));
        System.out.println("Lets start the game");
        System.out.println("Enter anything to roll:");
        
        //int numbers = (int) (1 + (Math.random() * 6));
      

        int points = 0;

        while (true) {
            int diceRoll = rollDice();

            System.out.print("You rolled a "+diceRoll+". ");


            if( diceRoll == 4){

                System.out.println(" - 0 points for you");
            }

            else if( diceRoll == 6){
                System.out.println("You lost!");
                break;
            }

            else {
                points ++;
                System.out.println(" - 1 point for you");
                continue;
            
            }
                
        }


        System.out.println("Points = " + points);


        
    }

    public static int rollDice() {
        int randomNumber = (int) (1 + (Math.random() * 6));
        //randomNumber += 1;
        return randomNumber;
    }
    
}
