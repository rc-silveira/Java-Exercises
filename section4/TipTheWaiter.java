package section4;

public class TipTheWaiter {
    public static void main(String[] args) {
        
        tiptheWaiter(50);
    }

    public static void tiptheWaiter(double bill){
        double tip = bill * 0.50;
        System.out.println("The bill is going to be " + tip);
    }
    
}
