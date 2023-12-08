package minggu4;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;
        int width;
        int circumference;

        length = input.nextInt();
        width = input.nextInt();

        circumference = length * width;

        System.out.println(circumference);

    }
}
