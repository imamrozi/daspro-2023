package minggu3;

public class VariabelDanTIpeData {
    public static void main(String[] args) {
        String salahSatuHobbySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        boolean status;
        System.out.println(salahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai? "+isPandai);
        System.out.println("Jenis kelamin= "+jenisKelamin);
        System.out.println("Umurku saat ini= "+_umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s dan bertinggi badan %s", $ipk, tinggi));
        status = true;
    }
}
