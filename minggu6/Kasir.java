package minggu6;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        int total, discount, purchase;
        boolean isMember;
        Scanner input = new Scanner(System.in);

        System.out.print("Is member? (true/false) = ");
        isMember = input.nextBoolean();
        System.out.print("Total = ");
        total = input.nextInt();

        if(isMember)
            if(total > 500000)
                discount = 50000;
            else
                discount = 25000;
        else
            if(total > 200000)
                discount = 10000;
            else
                discount = 0;
        
        purchase = total - discount;
        System.out.println("Total = "+total);
        System.out.println("Discount = "+discount);
        System.out.println("---------------------");
        System.out.println("Purchase = "+purchase);
    }
}
