package minggu9;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int book[][] = new int[3][3];        
        int book2[][] = {{2,8,6},{7,3,6},{4,6,5}};
        book[0][0] = 2;
        book[0][1] = 8;
        book[0][2] = 6;
        book[1][0] = 7;
        book[1][1] = 3;
        book[1][2] = 6;
        book[2][0] = 4;
        book[2][1] = 6;
        book[2][2] = 5;

        int [][] temperature = new int[5][7];
        Scanner input = new Scanner(System.in);
        /*temperature[0][0] = input.nextInt();
        temperature[0][1] = input.nextInt();
        temperature[0][2] = input.nextInt();
        temperature[0][3] = input.nextInt();
        temperature[0][4] = input.nextInt();
        temperature[1][0] = input.nextInt();
        temperature[1][1] = input.nextInt();
        temperature[1][2] = input.nextInt();
        temperature[1][3] = input.nextInt();
        temperature[1][4] = input.nextInt();
        temperature[2][0] = input.nextInt();
        temperature[2][1] = input.nextInt();
        temperature[2][2] = input.nextInt();
        temperature[2][3] = input.nextInt();
        temperature[2][4] = input.nextInt();*/

        //perulangan baris
        for(int baris=0;baris<temperature.length;baris++){
            System.out.println("Kota ke "+(baris+1));
            //perulangan kolom
            for(int kolom=0;kolom<temperature[0].length;kolom++){
                System.out.print("Suhu hari ke "+(kolom+1)+" = ");
                temperature[baris][kolom] = input.nextInt();
            }
        }

        /*System.out.println(temperature[0][0]);
        System.out.println(temperature[0][1]);
        System.out.println(temperature[0][2]);
        System.out.println(temperature[0][3]);
        System.out.println(temperature[0][4]);
        System.out.println(temperature[1][0]);
        System.out.println(temperature[1][1]);
        System.out.println(temperature[1][2]);
        System.out.println(temperature[1][3]);
        System.out.println(temperature[1][4]);
        System.out.println(temperature[2][0]);
        System.out.println(temperature[2][1]);
        System.out.println(temperature[2][2]);
        System.out.println(temperature[2][3]);
        System.out.println(temperature[2][4]);*/
        
        //perulangan baris
        /*for(int baris=0;baris<temperature.length;baris++){
            System.out.println("Kota ke "+(baris+1));
            //perulangan kolom
            for(int kolom=0;kolom<temperature[0].length;kolom++){
                System.out.print(temperature[baris][kolom]+" ");
            }
            System.out.println();
        }*/
        int kotaKe = 0;
        for(int[] tempPerKota:temperature){
            System.out.println("Kota ke "+(kotaKe+1));
            double avgTempPerKota = 0;
            int sumTempPerKota = 0;
            for(int tempPerHari:tempPerKota){
                System.out.print(tempPerHari+" ");
                sumTempPerKota = sumTempPerKota + tempPerHari;
            }
            avgTempPerKota = sumTempPerKota/tempPerKota.length;
            System.out.println();
            System.out.println("Rata-rata suhu pada kota ke "+(kotaKe+1)+" = "+
                                avgTempPerKota);
            kotaKe++;
        }
    }
}
