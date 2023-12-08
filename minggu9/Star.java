package minggu9;

public class Star {
    public static void main(String[] args) {
        //bintang-bintang 5 baris
        /*for(int h=0;h<5;h++){
            //bintang 5 kolom
            for(int i=0;i<(5-h);i++){    
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int h=0;h<5;h++){
            //bintang 5 kolom
            for(int i=0;i<=h;i++){    
                System.out.print("*");
            }
            System.out.println();
        }*/
        /* 
        for(int h=0;h<5;h++){
            //bintang 5 kolom
            int x = 1;
            for(int i=0;i<5;i++){   
                if(i<5-h-1)
                    System.out.print(" ");
                else
                    System.out.print(x++);
            }
            System.out.println();
        }*/
        for(int h=0;h<15;h++){
            //bintang 5 kolom
            for(int i=0;i<15;i++){    
                if(h==0 || h==14 || i==0 || i==14 || i==h
                || i==15-h-1 || i==15/2 || h==15/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
