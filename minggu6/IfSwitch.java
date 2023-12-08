package minggu6;

public class IfSwitch {
    public static void main(String[] args) {
        boolean isMember = true;
        int total = 3000;
        int discount = 0;

        if(isMember){
            switch(total){
                case 1000: discount = 100;
                            break;
                case 2000: discount = 200;
                            break;
                default: 
                            if(total < 1000){
                                discount = 0;
                            } else{
                                discount = 300;
                            }       
            }
        }else{

        }
        System.out.println("Discount = "+discount);
    }
}
