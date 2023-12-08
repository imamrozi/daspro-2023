package minggu5;

import java.util.Scanner;

public class IfKondisi {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Input temperature = ");
        int temperature = input05.nextInt();

        if(temperature<16){
            System.out.println("Put on your jacket!!");
        }else{
            System.out.println("Wear your hat!!");
        }

        String username = "u001";
        
    }
}
