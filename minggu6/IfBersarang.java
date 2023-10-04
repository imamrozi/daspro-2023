package minggu6;

public class IfBersarang {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if(x++ <5 && y++ < 50){
           System.out.println("Kondisi true");
            System.out.println("x = "+x);
           System.out.println("y = "+y);
        }else
            System.out.println("Kondisi false");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
    }
}
