package minggu7;

import java.util.Scanner;

public class BedaWhileDanFor {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x = input.nextInt();
         while(x!=-1){
            System.out.println("ulang lagi?");
            x = input.nextInt();
         }

         /*do{
            System.out.println("ulang lagi?");
            x = input.nextInt();
         }while(x!=-1);*/


         for(;x!=-1;){

         }
    }
}
