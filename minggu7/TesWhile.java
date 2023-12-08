package minggu7;

import java.util.Scanner;

public class TesWhile {
    public static void main(String[] args) {
        String username="", password="";
        Scanner input = new Scanner(System.in);

        int error = 0;
        boolean isAuthenticated = false;
        while(!(username.equals("admin")&&
                password.equals("12345"))){
            if(error<3){
                System.out.println("username = ");
                username = input.next();
                System.out.println("password = ");
                password = input.next();
                error++;
            }else{
                System.out.println("The maximum login attempt exeeded");
                break;
            }   
        }
        
        System.out.println("Welcome...");

    }
}
