package minggu9;

import java.util.Scanner;

public class ArrayMonth {
    public static void main(String[] args) {
        String[] month = {"jan","feb","mar","apr","may",
                    "jun","jul","aug","sep","oct","nov","dec"};
        for(String m:month){
            System.out.println(m);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number = ");
        int num = input.nextInt();
        System.out.println("Correlated month = "+month[num-1]);
    }
}
