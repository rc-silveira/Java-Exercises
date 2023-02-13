import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two ints on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two big ints on the same line");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals on the same line");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text on the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntegers : " + num1 + " " + num2);
        System.out.println("\tBig Integers : " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals : " + decimal1 + " " + decimal2);
        System.out.println("\tText : " + text1 + " " + text2);


    }
}
