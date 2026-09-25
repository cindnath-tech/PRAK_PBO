package P4.id.ac.polinema.relasiclass.tugas;

public class MainLaundry {
    public static void main(String[] args) {
        Layanan cuciKering = new Layanan("Cuci Kering", 7000);
        Layanan cuciSetrika = new Layanan("Cuci Setrika", 10000);
        Pesanan pesanan = new Pesanan("L001", 5);
        Pelanggan pelanggan = new Pelanggan("Johan", "08125674890", pesanan);

        pesanan.tambahDetail("Cuci Kering", 3, 7000);
        pesanan.tambahDetail("Cuci Setrika", 2, 10000);

        System.out.println("=== DATA PELANGGAN ===");
        pelanggan.info();
        System.out.println("\n=== LAYANAN YANG DIPILIH ===");
        pesanan.pilihLayanan(cuciKering);
        pesanan.pilihLayanan(cuciSetrika);
    }
}
