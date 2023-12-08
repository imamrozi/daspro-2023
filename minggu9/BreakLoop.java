package minggu9;

import java.util.Scanner;

public class BreakLoop {
    public static void main(String[] args) {
        /*mylabel:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==5)
                    break mylabel;
                System.out.print("["+i+","+j+"]");
            }
            System.out.println();
        }*/
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<2*x;j++){
                if(i%2==0){
                    if(j%2==0 && j>=x-i-1 && j<x+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }else{
                    if(j%2!=0 && j>=x-i-1 && j<x+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }


        /*for(int i=0;i<x;i++){
            for(int j=0;j<2*x;j++){
                if(i%2==0){
                    if(j%2==0 && j>=x-i-1 && j<x+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }else{
                    if(j%2!=0 && j>=x-i-1 && j<x+i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}
