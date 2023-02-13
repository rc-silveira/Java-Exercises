package section4;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanned = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors game !");

        System.out.println("Choose your play : Rock | Paper | Scissor ");
        String choice = scanned.next().toLowerCase();

        String pcChoice = computerChoice();

        game(choice,pcChoice );

        System.out.println("Your choice: " + choice + "\nPc choice: " + pcChoice);

        scanned.close();

        
    }
    

    public static String game(String userInput, String pcInput){

        String result = "";

        if (userInput.equals ("rock") && pcInput.equals("scissor")) {
            System.out.println("You won !");
        }

        else  if (userInput.equals ("scissor") && pcInput.equals("paper")) {
            System.out.println("You won !");
        }

        else  if (userInput.equals ("paper") && pcInput.equals("rock")) {
            System.out.println("You won !");
        }

        else if (userInput.equals(pcInput) ) {
            System.out.println("Draw!");
        }

        else 
        System.out.println("You lost :( ");

        return result;

    }

    public static String computerChoice() {

        int choice = (int) (1 + (Math.random() * 3));
        

        switch(choice){
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissor";
            default: return " Error :( ";
        }

        
    }
    
}
