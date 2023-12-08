package minggu13;

public class Kubus {
    static double hitungVolume(int sisi){
        double vol = sisi*sisi*sisi;
        System.out.println("Volume kubus = "+vol);
        return vol;
    }
    static double hitungLuasPermukaan(int sisi){
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        System.out.println("Volume kubus dg sisi 3 = "+
                    hitungVolume(3));
        System.out.println("LP kubus dg sisi 3 = "+
                    hitungLuasPermukaan(3));

    }
}
