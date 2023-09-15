package minggu3;

public class Operator {
    public static void main(String[] args) {
        int op1 = 10;
        int op2 = 15;
        int op3 = 17;

        //op1 = op1+op2; //op1 += op2;
        //op1 %= op2; // op1 = op1%op2;

        //op1 = op2+op3; // op1 += op3;

        op1 &= op2; // op1 = op1&op2;

        System.out.println(op1);

        int finalGrade = 60;
        if(finalGrade<75){
            System.out.println("You have to retake!!");
        }else{
             System.out.println("Passed!!");
        }
    }
}
