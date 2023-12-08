package minggu7;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        int n, hasil=1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while(n>=1){
            hasil = n*hasil;
            System.out.print(n);
            if(n>1){
                System.out.print("*");
            }
            n--;
        }
        System.out.print(" = "+hasil);
    }
}
