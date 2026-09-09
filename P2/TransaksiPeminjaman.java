package P2;

public class TransaksiPeminjaman {
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jmlHariTerlambat;
    public int denda;

    public int hitungDenda() {
        denda = jmlHariTerlambat * 1000;
        return denda;
    }

    public void tampilInfoData() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nama Peminjam : " + namaPeminjam);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Jumlah Hari Terlambat : " + jmlHariTerlambat + " hari");
        System.out.println("Denda : Rp " + hitungDenda());
    }
}