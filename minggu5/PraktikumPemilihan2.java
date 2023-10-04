package minggu5;

import java.util.Scanner;

public class PraktikumPemilihan2 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input00.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        String password = "83649";
        if(password.equals("12345")){

        }

        String predikat=""; 
        if (total<=39) {
            predikat="E";
        }  else if (total<=65) {
            predikat="C+";
        } else if (total<=50) {
            predikat="D";
        } else if (total<=73) {
            predikat="B";
        } else if (total<=80) {
            predikat="B+";
        }  else if (total<=100) {
            predikat="A";
        }   

        // if (total > 80 && total <= 100) {
        //     predikat = "A";
        // } else if (total > 73 && total <= 80) {
        //     predikat = "B+";
        // } else if (total > 65 && total <= 73) {
        //     predikat = "B";
        // } else if (total > 60 && total <= 65) {
        //     predikat = "C+";
        // } else if (total > 50 && total <= 60) {
        //     predikat = "C";
        // } else if (total > 39 && total <= 50) {
        //     predikat = "D";
        // } else {
        //     predikat = "E";
        // }

        System.out.println("Predikat nilai Anda "+predikat);
        
        int x = 11, y = 15;
        int hasil = (x>10) ? ((x<=15) ? (++x) : (x)) : (x++);
        String text =  x<=15 ? "hello" : "world";
        //x<=15 ? System.out.println("hello") : System.out.println("world");
        System.out.println("Hasil = "+hasil);
    }
}
