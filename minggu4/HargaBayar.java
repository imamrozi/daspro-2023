package minggu4;

import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, jmlHalBuku;

        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;
        
       
        System.out.println("Input price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();

        totalPrice=price*quantity;

        totalDiscount=totalPrice*discount;

        purchasePrice=totalPrice-totalDiscount;

             
        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);
    }
}
