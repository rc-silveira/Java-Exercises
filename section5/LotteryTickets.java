import java.util.Arrays;

public class LotteryTickets {

    public static void main(String[] args) {
        
        int[] ticket = {34,43,45,65,21,54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        printTicketNumbers(ticket);

        printTicketNumbers(ticket2);
    }

    public static void printTicketNumbers(int [] ticket){

        for (int i = 0; i < ticket.length; i++) {
            System.out.println(ticket[i]);
        }
        System.out.print("\n\n");

    }
    
}
