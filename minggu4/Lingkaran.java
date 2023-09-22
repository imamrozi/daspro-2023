package minggu4;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        int r;
        double circumference, area;

        double phi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Input radius: ");
        r = input.nextInt();

        area = 3.14*r*r;
        circumference = 2*3.14*r;

        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
    }
}
