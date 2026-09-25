package P4.id.ac.polinema.relasiclass.tugas;

public class Pesanan {
    private String nomorPesanan;
    private DetailPesanan[] detailPesanan;
    private int jumlahDetail;

    public Pesanan(String nomorPesanan, int kapasitas) {
        this.nomorPesanan = nomorPesanan;
        this.detailPesanan = new DetailPesanan[kapasitas];
        this.jumlahDetail = 0;
    }

    public void tambahDetail(String Layanan, double berat, double hargaPerKg) {
        detailPesanan[jumlahDetail] =
            new DetailPesanan(Layanan, berat, hargaPerKg);

        jumlahDetail++;
    }

    public void pilihLayanan(Layanan layanan) {
        layanan.info();
    }

    public double hitungTotal() {
        double total = 0;

        for (int i = 0; i < jumlahDetail; i++) {
            total += detailPesanan[i].hitungTotal();
        }

        return total;
    }

    public void info() {
        System.out.println("Nomor Pesanan: " + nomorPesanan);

        System.out.println("Detail Pesanan:");

        for (int i = 0; i < jumlahDetail; i++) {
            detailPesanan[i].info();
        }

        System.out.println("Total Bayar: Rp" + hitungTotal());
    }
}
