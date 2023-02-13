package section4;

import java.util.Random;
import java.util.Scanner;

public class userGuess {

    public static void main(String[] args) {

        Scanner scanned = new Scanner((System.in));
        
        System.out.println("Choose a number");
        int number = scanned.nextInt();

        int randNumber = (int) (Math.floor(Math.random() * 5) +1);

        while (number != randNumber) {

            System.out.print("Guess again:");
            number = scanned.nextInt();
            
        }

        System.out.println("You got it!");
        
        scanned.close();
    }
    
}
