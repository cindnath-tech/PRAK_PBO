package P1;

public class TugasDemo {
    public static void main(String[] args) {
        KipasDinding kipas1 = new KipasDinding();
        KipasBerdiri kipas2 = new KipasBerdiri();
        Meja meja1 = new Meja();
        Kursi kursi1 = new Kursi();

        kipas1.setBrand("Miyako");
        kipas1.levelChanges(3);
        kipas1.setAngle(90);
        kipas1.printInfo();
        System.out.println("---------------------");

        kipas2.setBrand("KrisBow");
        kipas2.levelChanges(2);
        kipas2.setHeight(100);
        kipas2.printInfo();
        System.out.println("---------------------");

        meja1.setBahan("Kayu");
        meja1.setUkuran(25);
        meja1.printInfo();
        System.out.println("---------------------");

        kursi1.setBahan("Kayu dan rotan");
        kursi1.setTinggi(71);
        kursi1.printInfo();
    }
}
