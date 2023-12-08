package minggu9;

import java.util.Scanner;

public class SegitigaSamaSisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Angka = ");
        int angka = input.nextInt();
        for(int i=0;i<angka;i++){
            for(int j=0;j<2*angka;j++){
                if(i%2==0){
                    if(j%2==0 && j>=angka-(i+1) && j<angka+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }else{
                    if(j%2!=0 && j>=angka-(i+1) && j<angka+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
