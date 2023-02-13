package section4;

import java.util.Scanner;

public class NumberCount {

    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        System.out.println("Pick a number to count by : ");
        int numberCountBy = scanned.nextInt(); // contar de 2 em 2...

        System.out.println("Start counting from: ");
        int numberCountFrom = scanned.nextInt(); //contar a partir de 0

        System.out.println("Pick a number to count to: ");
        int numberCountTo = scanned.nextInt(); //contar até 10

        for (int i = numberCountFrom; i <= numberCountTo ; i+=numberCountBy) {

            System.out.println(i);
            
        }

        scanned.close();
        

        }      
 
}




