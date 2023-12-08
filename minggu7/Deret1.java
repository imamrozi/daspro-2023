package minggu7;

public class Deret1 {
    public static void main(String[] args) {
        double number = 1.0;
        int count = 0;
        double sum = 0.0;

        while (number < 100) {
            if (number < 100) {
                sum += number;
                count++;
                System.out.print(" "+number);
            }
            
            if (count % 2 == 1) {
                number += 1.5;
            } else {
                number -= 0.5;
            }
        }

        System.out.println("Jumlah bilangan dalam deret yang kurang dari 100 adalah: " + sum);
    }
}
