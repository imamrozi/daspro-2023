package minggu5;

import java.util.Scanner;

public class ElseIfKondisi {
    public static void main(String[] args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.print("Input temperature = ");
        int temperature = sc00.nextInt();

        if(temperature<16){
            System.out.println("Put on your jacket!!");
        }else if(temperature<20){
            System.out.println("Put on your warm clothes!!");
        }else{
            System.out.println("Wear your hat!!");
        }
    }
}
