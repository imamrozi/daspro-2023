package minggu3;

import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlTabunganAwal, lamaMenabung;
        double prosentaseBunga = 0.02, bunga, jmlTabunganAkhir;

        System.out.println("Masukkan jumlah tabungan awal: ");
        jmlTabunganAwal = input.nextInt();
        System.out.println("Masukkan lama menabung Anda: ");
        lamaMenabung = input.nextInt();

        bunga = lamaMenabung*prosentaseBunga*jmlTabunganAwal;

        jmlTabunganAkhir = jmlTabunganAwal+bunga;

        System.out.println("Jumlah tabungan akhir ANda adalah: "+jmlTabunganAkhir);


    }
}
