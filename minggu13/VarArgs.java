package minggu13;

public class VarArgs {
    static void cobaVarArgs(int ...a){
        for(int x:a){
            System.out.print(x+" - ");
        }
    }
    static void cobaArrayArgs(int []a){
        for(int x:a){
            System.out.print(x+" - ");
        }
    }
    public static void main(String[] args) {
        cobaVarArgs(10,45,67);
        int data[] = {23,45,32,34,56};
        cobaArrayArgs(data);
    }
}
