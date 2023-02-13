import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car ");
        System.out.println(" . Select option 'b' to sell a car ");
        String option = scan.nextLine();

        switch (option) {
            case "a":
            System.out.println("Whats your budget?");
            int budget = scan.nextInt();
            if(budget >= 10000){
                System.out.println("Great a BMW M3 is available");
                System.out.println("Do you have insurance ? YES | NO\n");
                scan.nextLine();
                String insurance = scan.nextLine().toLowerCase();
                System.out.println("Do you have a driver license? YES | NO\n");
                String license = scan.nextLine().toLowerCase();
                System.out.println("Whats your credit score?");
                int creditScore = scan.nextInt();

                if(insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                    System.out.println("The car is yours !");
                }

                else{
                    System.out.println("Sorry :(");
                }

            }
                else 
                    System.out.println("We don't have nay cars under that price");
                

                break;
            
            case "b":
                System.out.println("Whats the value of your car ?");
                int value =  scan.nextInt();
                System.out.println("Tell me you selling price?");
                int price = scan.nextInt();

                if(value > price && price <3000)
                System.out.println("Deal !");

                else{
                    System.out.println(" :(((( ");
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        scan.close();

      

       

    

    
        }
}
