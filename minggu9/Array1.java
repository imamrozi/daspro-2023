package minggu9;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //deklarasi
        //int a[] = new int[34];

        //inisialisasi
        //int b[] = {23,5,45,3,4,2,3,4,56,453};
        /*System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);*/
        /*for(int i=b.length;i>=0;i--){
            System.out.println(b[i]);
        }*/


       // int n = 4;
       // int a[] = new int[n];

/* 
        String[] namaBulan = new String[12];
        String[] namaBulan2 = {"Jan","Feb","Mar","Apr",
                "Mei","Jun","Jul","Ags","Sep","Okt","Nop","Des"};
        
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<namaBulan.length;i++){
            namaBulan[i] = sc.next();
        }

        for (String bulan : namaBulan) {
            System.out.println(bulan);
        }
*/
        double[] data = new double[8];
        for(int i=0;i<data.length;i++){
            data[i] = Math.random();
        }
        double sum = 0;
        for (double d : data) {
            sum = sum+d;
        }
        double avg = sum/data.length;
        System.out.println("SUM = "+sum);
        System.out.println("AVG = "+avg);
    }
}
