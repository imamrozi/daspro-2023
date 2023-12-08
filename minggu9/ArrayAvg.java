package minggu9;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        double avg;
        int sum;
        Scanner input = new Scanner(System.in);

        //INPUT
        for(int i=0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        //CALCULATION
        for(int i=0;i<numbers.length;i++){
            sum = sum+number[i];
        }
        avg = sum/numbers.length;
        System.out.println("Average = "+avg);
    }
}
