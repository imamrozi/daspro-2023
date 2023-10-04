package minggu6;

import java.util.Scanner;

public class Selection2Exp2 {
    public static void main(String[] args) {
        double angle1, angle2, angle3, totalAngle;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sudut1 = ");
        angle1 = input.nextDouble();
        System.out.print("Input sudut2 = ");
        angle2 = input.nextDouble();
        System.out.print("Input sudut3 = ");
        angle3 = input.nextDouble();

        totalAngle = angle1+angle2+angle3;
        if(totalAngle == 180)
            if(angle1==90 || angle2==90 || angle3==90)
                if(angle1==angle2 || angle2==angle3 || angle1==angle3)
                    System.out.println("Segitiga siku-siku sama kaki");
                else
                    System.out.println("Segitiga siku-siku");
            else if(angle1==60&&angle2==60&&angle3==60)
                System.out.println("Segitiga sama sisi");
            else if(angle1==angle2 || angle2==angle3 ||angle1==angle3)
                System.out.println("Segitiga sama kaki");
            else
                System.out.println("Segitiga sembarang");
        else
            System.out.println("Not a triangle");
        
    }
}
