package P4.id.ac.polinema.relasiclass.tugas;

public class Pelanggan {
    private String nama;
    private String noHp;
    private Pesanan pesanan;

    public Pelanggan(String nama, String noHp, Pesanan pesanan) {
        this.nama = nama;
        this.noHp = noHp;
        this.pesanan = pesanan;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHp);
        pesanan.info();
    }
}
