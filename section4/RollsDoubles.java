package section4;

import java.util.Random;

public class RollsDoubles {

    public static void main(String[] args) {

        int Dice1 =  (int) (1 + (Math.random() * 6));
        int Dice2 =  (int) (1 + (Math.random() * 6));

        while (Dice1 != Dice2) {

            System.out.println("Dice 1 - " + Dice1);
            Dice1 =  (int) (1 + (Math.random() * 6));
            

            System.out.println("Dice 2 - " + Dice2);
            Dice2 =  (int) (1 + (Math.random() * 6));
            System.out.println("-----------------");
            
        }

        System.out.println("Dice 1 - " + Dice1);
        System.out.println("Dice 2 - " + Dice2);
        System.out.println("You got it!");
        


    }
    
}
