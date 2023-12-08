package minggu5;

import java.util.Scanner;

public class PraktikumPemilihan1 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Masukan angka:  ");
        int angka = input00.nextInt();
        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");

        // TODO: 24/09/19 using ternary operator
        String output = angka % 2 == 0 ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan genap";
        System.out.println(output);

        int x = 100;
        int y = x>80 ? x++ : ++x;
        System.out.println(y);


    }
}
