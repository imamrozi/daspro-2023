package minggu13;

public class PassByValRef{
    public static void main(String[] args) {
        String data = "Hello";
        System.out.println(data);
        ubah(data);
        System.out.println(data);

        Segitiga sg = new Segitiga();
        sg.sisi = 5;
        System.out.println(sg.sisi);
        ubahSisi(sg);
        System.out.println(sg.sisi);
        int[] umur={10,11,12};
        ubahUmur(umur);
        int[] umurNew = ubahUmur2(umur);
    }
    static void ubahUmur(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = i+50;
        }
    }
    static int[] ubahUmur2(int[] arr){
        int[] umurBaru = new int[arr.length];
        for(int i=0;i<umurBaru.length;i++){
            umurBaru[i] = i+50;
        }
        return umurBaru;
    }
    static void ubah(String s){
        s = "cek string!";
    }
    static void ubahSisi(Segitiga s){
        s.sisi = 100;
    }
    static Mahasiswa getMhs(){
        Mahasiswa mhs = null;
        return mhs;
    }

}