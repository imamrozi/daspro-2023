package minggu4;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        int jariJari;
        double phi = 3.14, luas, keliling;

        Scanner sc = new Scanner(System.in);
        jariJari = sc.nextInt();

        luas = phi*jariJari*jariJari;
        keliling = 2*phi*jariJari;

        System.out.println("Luas = "+luas);
        System.out.println("Keliling = "+keliling);
    }
}
