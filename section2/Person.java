import java.util.Scanner;

public class Person{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhats your name ? ");
        String name = scanner.nextLine();

        System.out.println("\nHow old are you ? ");
        int age = scanner.nextInt();


        System.out.println("My name is" + name + " and I'm " + age + " years old");
        
    }
}
