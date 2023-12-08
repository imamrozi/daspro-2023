package minggu7;

import java.util.Scanner;

class ForKelipatan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple;
        int sum=0, counter=0;
        System.out.print("Input the multiple = ");
        multiple = input.nextInt();
        for(int i=1;i<=50;i++){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
                //System.out.print(i+"-");
            } 
        }
        //System.out.println();
        double avg = sum/counter;
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        double average = sum/counter;
        System.out.println("Rata-rata = "+average);
/* 
        int i=0;
        while(i<=50){
            if(i%kelipatan == 0){
                total = total + i;
                counter++;
                System.out.print(i+" - ");
            } 
            i++;
        }*/
    }
}