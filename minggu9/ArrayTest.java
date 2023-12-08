package minggu9;

public class ArrayTest {
    public static void main(String[] args) {
        String name[] = new String[7];
        name[0] = "hamam";
        name[1] = "agna";
        name[3] = "majid";
        name[2] = "farhan";
        name[4] = "anton";
        name[5] = "dsds";
        name[6] = "rerr";
        /*System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);*/

        for(int i=name.length-1;i>0;i--){
            System.out.println(name[i]);
        }

        double grades[] = {32.5, 45.09, 45, 56, 45.345, 45.65};
    }
}
