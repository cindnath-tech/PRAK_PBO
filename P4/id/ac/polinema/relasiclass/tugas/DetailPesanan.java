package P4.id.ac.polinema.relasiclass.tugas;

public class DetailPesanan {
    private String layanan;
    private double berat;
    private double hargaPerKg;

    public DetailPesanan(String layanan, double berat, double hargaPerKg) {
        this.layanan = layanan;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }

    public double hitungTotal() {
        return berat * hargaPerKg;
    }

    public void info() {
        System.out.println("Layanan: " + layanan);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Harga Per KG: Rp " + hargaPerKg + " /kg");
        System.out.println("Total: Rp" + hitungTotal());
    }
}
