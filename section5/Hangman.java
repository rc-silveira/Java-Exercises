import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String randomWord = chooseWord();

        //System.out.println(randomWord);

        System.out.println("+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +   
        "    |\n" +
        "    |\n" +
        "=========\n");
        char[] placeholders = new char[randomWord.length()];
        for (int i = 0; i < randomWord.length(); i++) {
            placeholders[i] = '_';
            
        }
        System.out.println("\n");

        int misses = 0;

        char[] missedGuesses = new char[6];

        while (misses < 6) {
            System.out.println(gallows[misses]);

            System.out.print("Word: "  );
            printPlaceholders(placeholders);
            System.out.print("\n");

            System.out.print("Misses:   ");
            printMissedGuesses(missedGuesses);
            System.out.print("\n\n");

            System.out.print("Guess:   ");
            char guess = scan.nextLine().charAt(0);
            System.out.print("\n");

            if (checkGuess(randomWord, guess)) {
                updatePlaceholders(randomWord, placeholders, guess);
            } else {
                missedGuesses[misses] = guess;
                misses++;
            }
            
            if (Arrays.equals(placeholders, randomWord.toCharArray())) {
                System.out.print(gallows[misses]);
                System.out.print("\nWord:   ");
                printPlaceholders(placeholders);
                System.out.println("\nGOOD WORK!");                
                break;
            }
        }

        
/* 
        for (int i = 0; i < 7; i++) { //o jogador só tem 6 oportunidades para descobrir a palavra
            char[] misses = new char [6];
            char[] guesses = new char [randomWord.length()];

            System.out.println("\nChoose a letter");
            char letter = scan.next().charAt(0);

            for (int j = 0; j < randomWord.length(); j++) {

                char currentRandomLetter = randomWord.charAt(j);
                
                if (currentRandomLetter == letter) {

                    guesses[i] = letter;

                }        

                else if(currentRandomLetter != letter) {

                    misses[i] = letter;
                }        
                
            }

            System.out.print("\nGuesses: " + guesses[i]);
            System.out.print("\nMisses: " + misses[i]);
            
            
           
        }

*/
       
        

        
    }


    public static String chooseWord(){
        String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote",
        "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", 
        "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino",
        "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
        
        System.out.println("*** HANGMAN ***");
        Random rand = new Random();
        int index = rand.nextInt(words.length); //procurar um inteiro random que corresponde ao indice de uma word
        
        String randomWord = words[index]; // randomWord = a uma word que ele encontrar, sendo o index o indice da palavra encontrada

        return randomWord;
    }


    public static boolean checkGuess(String word, char guess){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
        
    }

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
                System.out.print(" " + placeholders[i]);
            }
        System.out.print("\n");
    }

    public static void updatePlaceholders(String word, char[] placeholders, char guess) {

        for (int j = 0; j < word.length(); j++) {

            if (word.charAt(j) == guess) {
                placeholders[j] = guess;
            }
        }
    }

    public static void printMissedGuesses(char[] misses) {
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i]);
        }
    }

    
}


    
