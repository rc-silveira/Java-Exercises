import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArrays {
    public static void main(String[] args) {

        /*String [] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String [] newMenu = new String [5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
            //System.out.println(i + ". " + menu[i]);
        }
        newMenu[3] = "Costa's cafe";
        newMenu[4] = "House Blend";
        System.out.println(Arrays.toString(newMenu));
        */ 
//WORKBOOK 6.9
/*
        double [] price = {1.99, 2.99, 3.99, 4.99};

        double [] afterTax = new double [4];

        for (int i = 0; i < afterTax.length; i++) {

            afterTax[i] = price[i] * 1.13;
            
        }

        System.out.println("Original prices :" + (Arrays.toString(price)));
        System.out.println("After tax prices :" + (Arrays.toString(afterTax)));
*/
//WORKBOOK 6.10
Scanner scan = new Scanner(System.in);
System.out.println("How many topping do you want ?");
 int toppingNumber = scan.nextInt(); scan.nextLine();

 String [] toppings = new String [toppingNumber];

 System.out.println("Enter your toppings");

 for (int i = 0; i < toppings.length; i++) {
    System.out.print(i + " - ");
    toppings[i] = scan.nextLine();
 }

 System.out.println("\nThank you! Here are the toppings you ordered");

for (int i = 0; i < toppings.length; i++) {
    System.out.println(toppings[i]);
}
scan.close();



    }

    
}
