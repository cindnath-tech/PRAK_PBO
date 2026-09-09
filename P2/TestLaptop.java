package P2;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop lab1 = new Laptop();
        lab1.kodeInventaris = "LAB-JTI-017";
        lab1.merk = "Lenovo ThinkPad E14";
        lab1.ramGB = 8;
        lab1.tampilSpesifikasi();
        System.out.println("RAM setelah upgrade : " + lab1.upgradeRam(8) + " GB");
        lab1.tampilSpesifikasi();
        int hargaSewa = lab1.hitungHargaSewa(3);
        System.out.println("Harga Sewa : Rp " +hargaSewa);

    }
}
