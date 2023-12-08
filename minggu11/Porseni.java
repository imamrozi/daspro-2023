package minggu11;

import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String athlete[][] = new String[4][5];
        //input
        for(int i=0;i<athlete.length;i++){
            for(int j=0;j<athlete[i].length;j++){
                System.out.print("Name ["+i+","+j+"] = ");
                athlete[i][j] = input.next();
            }
        }
        //transform 2d to 1d array
        String [] sortedAthlete = new String[20];
        int idx = 0;
        for(int i=0;i<athlete.length;i++){
            for(int j=0;j<athlete[i].length;j++){
                sortedAthlete[idx] = athlete[i][j];
                idx++;
            }
        }
        //sort
        for(int i=0;i<sortedAthlete.length;i++){
            for(int j=0;j<sortedAthlete.length-i-1;j++){
                if(sortedAthlete[j].compareTo(sortedAthlete[j+1])>0){
                    String tmp = sortedAthlete[j];
                    sortedAthlete[j] = sortedAthlete[j+1];
                    sortedAthlete[j+1] = tmp;
                }
            }
        }
        //display
        for(String name: sortedAthlete){
            System.out.println(name);
        }
    }
}
