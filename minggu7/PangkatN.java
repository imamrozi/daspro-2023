package minggu7;

import java.util.Scanner;

public class PangkatN {
    
    public static void main(String[] args) {
        int n, hasil=1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i = 1;
        while(i<=n){
            hasil = 2*hasil;
            i++;
        }

        for(int x=1;x<=n;x++){
            hasil = 2*hasil;
        }

        int cek = input.nextInt();
        while()

        System.out.print(" = "+hasil);
    }
}
