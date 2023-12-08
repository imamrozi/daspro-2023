package minggu7;

public class ProsesPerulangan {
    public static void main(String[] args) {
        /*System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("Hello World 4");
        System.out.println("Hello World 5");*/
        int hasil = 0;
        for(int cetak=1; cetak<=5; cetak++){
            if(cetak==3){
                break;
            }  
            System.out.println(cetak);
            hasil = hasil + cetak;
            System.out.println("Total = "+hasil);  
               
        }
       
    }
}
