package minggu7;

public class Tes {
   public static void main(String[] args) {
        /*System.out.println("Hello student ");
         System.out.println("Hello student ");
         System.out.println("Hello student ");
         System.out.println("Hello student ");
         System.out.println("Hello student ");*/
         int sum = 0;
         for(int i=0;i<=100;i=i+1){
            //System.out.println("Hello student "+i);
            sum = sum+i;
            //System.out.print(i+"-");
            if(i%2 == 0)
                System.out.print((i*2)+"-");
            else
                System.out.print((i*i)+"-");
         }
         System.out.println("TOtal = "+sum);
    } 
}
