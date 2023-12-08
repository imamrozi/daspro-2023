package minggu13;

import java.util.Scanner;

public class TugasMahasiswa {
    static void inputNilai(int[][] nilaiMhs){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<nilaiMhs.length;i++){
            for(int j=0;j<nilaiMhs[i].length;j++){
                System.out.print("nilai ["+i+"]["+j+"]=");
                nilaiMhs[i][j]=input.nextInt();
            }
        }

    }
    static int[][] inputNilai2(int[][] nilaiMhs){
        Scanner input = new Scanner(System.in);
        int[][] inputNilai = new int[nilaiMhs.length][nilaiMhs[0].length];
        for(int i=0;i<inputNilai.length;i++){
            for(int j=0;j<inputNilai[i].length;j++){
                System.out.print("nilai ["+i+"]["+j+"]=");
                inputNilai[i][j]=input.nextInt();
            }
        }
        return inputNilai;
    }
    static void tampilNilai(int[][] nilaiMhs){
        for(int i=0;i<nilaiMhs.length;i++){
            for(int j=0;j<nilaiMhs[i].length;j++){
                System.out.println("nilai mhs "+i+" hari "+j+"="+nilaiMhs[i][j]);
            }
        }
    }
    static int getHariKeNilaiMax(int[][] nilaiMhs){
        int hariKe = 0;
        int nilaiMax = nilaiMhs[0][0];
        for(int i=0;i<nilaiMhs.length;i++){
            for(int j=0;j<nilaiMhs[i].length;j++){
                if(nilaiMhs[i][j]>nilaiMax){
                    nilaiMax = nilaiMhs[i][j];
                    hariKe = j;
                }
            }
        }
        return hariKe+1;
    }
    static int getMhsKeNilaiMax(int[][] nilaiMhs){
        int mhsKe = 0;
        int nilaiMax = nilaiMhs[0][0];
         for(int i=0;i<nilaiMhs.length;i++){
            for(int j=0;j<nilaiMhs[i].length;j++){
                if(nilaiMhs[i][j]>nilaiMax){
                    nilaiMax = nilaiMhs[i][j];
                    mhsKe = i;
                }
            }
        }
        
        return mhsKe+1;
    }
    static int[] getHariMhsNilaiKeNilaiMax(int[][] nilaiMhs){
        int hariKe = 0;
        int mhsKe = 0;
        int nilaiMax = nilaiMhs[0][0];
         for(int i=0;i<nilaiMhs.length;i++){
            for(int j=0;j<nilaiMhs[i].length;j++){
                if(nilaiMhs[i][j]>nilaiMax){
                    nilaiMax = nilaiMhs[i][j];
                    hariKe = j;
                    mhsKe = i;
                }
            }
        }
        int[] hasil = {hariKe+1, mhsKe+1, nilaiMax};
        return hasil;
    }
    public static void main(String[] args) {
        int[][] dataNilai = new int[5][7];
        inputNilai(dataNilai);
        tampilNilai(dataNilai);
        int[] hasil = getHariMhsNilaiKeNilaiMax(dataNilai); 
        System.out.println("Nilai paling besar "+hasil[2]+" ada di hari ke = "+hasil[0]+
                            " didapatkan oleh mahasiswa ke = "+hasil[1]);
    }
}
