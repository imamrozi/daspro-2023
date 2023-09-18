package minggu4;

import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk, jmlHalBuku;
        int harga, jumlah;
        double dis, total, bayar,jmlDis;
        
        System.out.println("Masukkan merk buku yang akan dibeli");
        merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman dari buku yang akan dibeli");
        jmlHalBuku=input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon");
        dis=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk buku yang Anda beli adalah "+merk);
        System.out.println("Jumlah halaman buku yang Anda beli adalah "+jmlHalBuku);        
        System.out.println("Diskon yang Anda dapatkan adalah "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+bayar);
    }
}
