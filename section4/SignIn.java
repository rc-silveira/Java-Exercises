package section4;

import java.util.Scanner;

public class SignIn {

    public static void main(String[] args) {

        Scanner scanned = new Scanner(System.in);

        String name = "rsilveir";
        String password = "123456";

        System.out.println("Insert your user name:");
        String userName= scanned.next().toLowerCase();

        System.out.println("Insert your user password:");
        String userPassword= scanned.next().toLowerCase();


        while(!userPassword.equals(password) ||!userName.equals(name)){
            System.out.println("Try again");

            System.out.println("Insert your user name:");
            userName= scanned.next();
            
            System.out.println("Insert your user password:");
            userPassword= scanned.next();

        }

        System.out.println("You got it!");
        scanned.close();    





    }
    
}
