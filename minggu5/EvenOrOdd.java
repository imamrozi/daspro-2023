package minggu5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Input a number = ");
        int number = input05.nextInt();

        if(number%2 == 0){
            System.out.println(number+" is an even number!");
        }else{
            System.out.println(number+" is an odd number!");
        }

        String result = number%2 == 0 ? number+" is an even number!" :  number+" is an odd number!";
        System.out.println(result);
    }
}
