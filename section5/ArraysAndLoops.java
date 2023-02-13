import java.util.Scanner;

public class ArraysAndLoops {
    public static void main(String[] args) {
/* 
        String [] kingdoms = {"Mercia","Wessex","Northumbria","East Anglia"};
        System.out.println("\nthe number of elements is " + kingdoms.length);

        for (int i = 0; i < kingdoms.length; i++) {
            //System.out.println(kingdoms[i]);
            System.out.println("The element at index " + i + " is " + kingdoms[i]);
        }
    */

    //WORKBOOK 6.2
/* 
    String [] students = {"Malfoy","Crabbe","Goyle","Pansy","Dean"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take seat " + i);
        }

*/
    //WORKBOOK 6.3
    
   /*  String [] store = {"apples","bananas","candy","chocolate","coffe", "tea"};

    System.out.println("Do you sell coffee ?");

    for (int i = 0; i < store.length; i++) {
        
        if (store[i].equals("coffe")) {
            System.out.println("There's coffe in " + i + " aisle");
        }
    }
    */

    //WORKBOOK 6.4
/* 
      String [] store = {"apples","bananas","candy","chocolate","coffe", "tea"};
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome");
      System.out.println("What can I help you find?");
      String product = scan.nextLine();

      for (int i = 0; i < store.length; i++) {
        if(product.equalsIgnoreCase(store[i])){
            System.out.println("Section " + i );
        }
      }
      
    scan.close();

    */

    //WORKBOOK 6.5 and 6.6
    /* 
      int [] numbers ={randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};

      int highScore = 0;

      int seat = 0;

      for (int i = 0; i < numbers.length; i++) {

        System.out.println("Here are the scores " + numbers[i]);

        if (numbers[i] > highScore) {

            highScore =  numbers[i];

            seat = i;
        }

      }

      System.out.println("Yhe higgest score is " + highScore );
      System.out.println("It's the gentelman in seat " + seat);

      
    */

    // WORKBOOK 6.7
    /* 
        String [] record = {"WIN","WIN","WIN","LOSS","WIN","WIN","LOSS"};

        int wins = 0;
        int losses = 0;

        for (int i = 0; i < record.length; i++) {
            
            if (record[i].equalsIgnoreCase("win")) {
                wins ++;
            }

            else if (record[i].equalsIgnoreCase("loss")){
                losses ++;
            }
        }

        System.out.println("WINS - " + wins);
        System.out.println("LOSSES - " + losses);
    


*/

      //WORKBOOK 6.8
      
      String [] apples = {"Gala", "Granny Smith", "Macintosh"};

      double [] prices = {1.99, 1.49, 1.29};

      for (int i = 0; i < prices.length; i++) {
        System.out.println(apples[i] + " : " +"$"+ prices[i] );
      }

    }

    

    public static int randomNumber(){
        int randNumber = (int) (Math.random() * 5000);

        return randNumber;
    }

    
}
