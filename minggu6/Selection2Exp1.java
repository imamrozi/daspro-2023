package minggu6;

import java.util.Scanner;

public class Selection2Exp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input year = ");
        int year = input.nextInt();

        if(year%4 == 0)
            if(year%100 != 0)
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
