package minggu9;

import java.util.Scanner;

public class BintangKotak {
    public static void main(String[] args) {
        for(int j=0;j<5;j++){
            //bintang 1 deret
            for(int i=0;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int j=0;j<5;j++){
            //bintang 1 deret
            for(int i=0;i<5-j;i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int j=0;j<10;j++){
            //bintang 1 deret
            for(int i=0;i<10;i++){
                if(i>=10-j-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        for(int j=0;j<angka;j++){
            //bintang 1 deret
            for(int i=0;i<angka;i++){
                if(j==0 || j==angka-1 || i==0 || i==angka-1 ||
                    j==angka/2 || i==angka/2 || j==i || i==angka-j-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
