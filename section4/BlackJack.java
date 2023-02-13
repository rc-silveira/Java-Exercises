package section4;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play BlakJack");
        
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        System.out.println("Get two cards");

        int firstCard = randomCard();
        int secondCard = randomCard();

        System.out.println("CARD 1 - " + DrawingCard(firstCard));
        System.out.println("CARD 2 - " + DrawingCard(secondCard));

        int handValue = Math.min(firstCard,10) + Math.min(secondCard,10); // if card < 10 -> card = 10


        System.out.println("Your hand value is " + handValue + "\n");

        int dealerfirstCard = randomCard();
        int dealersecondCard = randomCard();

        System.out.println("The dealer shows" + DrawingCard(dealerfirstCard) + " and has a card facing down\n" 
        + faceDown());

        int dealerTotal = Math.min(dealerfirstCard, 10) + Math.min(dealersecondCard, 10);
        System.out.println("\nThe dealer's total is hidden");


        while (true) {

            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }
            int newCard = randomCard();

            handValue += Math.min(newCard, 10);
            System.out.println("\n you get a " + DrawingCard(newCard));
            System.out.println("Total = " + handValue);

            

            if (option == "hit") {
                
                DrawingCard(newCard);

                System.out.println("Your new card is " +- newCard);

            }

            if (handValue > 21) {

                System.out.println("Bust ! Player loses!");
                System.exit(0);
                
            }
           
           
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are " + DrawingCard(dealerfirstCard) + " and\n " + DrawingCard(dealersecondCard));
        
        while (dealerTotal < 17) {
            int newCard = randomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\nDealer gets a " + DrawingCard(newCard));
            System.out.println("Dealer's total = " + dealerTotal
            );

            if (dealerTotal > 21) {
                System.out.println("Bust ! Dealer loses!");
                System.exit(0);
            }

            
            if (handValue > dealerTotal) {
                System.out.println("Player wins!");
            }
            else {
                System.out.println("Dealer's wins");
            }
      


        }


        
        
        scan.close();

    }

    public static String DrawingCard (int card){

        switch ((int)card){
        case 1:   
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: 
            return "This shouldn't get called.";
                }
    }

    public static String faceDown(){
        return
        "   _____\n" +
        "  |     |\n"+ 
        "  |  J  |\n"+ 
        "  | JJJ |\n"+ 
        "  |  J  |\n"+ 
        "  |_____|\n";
    }
    
    public static int randomCard() {
        double randomNumber = Math.random() * 13; // 1 ------ 12.999999
        randomNumber += 1;

        return (int)randomNumber;
        
                
    }

    public static String hitOrStay() {
        
        System.out.println("You want to hit or stay ? ");
        String choice = scan.nextLine();
        //boolean invalidResponse = !(choice.equals("hit") || choice.equals("stay"));
        
        while(!(choice.equalsIgnoreCase("hit") || choice.equalsIgnoreCase("stay"))){
            System.out.println("Please write hit or stay ");
            choice = scan.nextLine();
        }
        return choice;
    
    }
}
