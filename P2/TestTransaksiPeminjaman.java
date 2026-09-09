package P2;

public class TestTransaksiPeminjaman {
    public static void main(String[] args) {
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman();
        TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman();
        TransaksiPeminjaman transaksi3 = new TransaksiPeminjaman();

        transaksi1.idTransaksi = "TR001";
        transaksi1.namaPeminjam = "Johan";
        transaksi1.judulBuku = "Basis Data";
        transaksi1.jmlHariTerlambat = 0;
        transaksi1.tampilInfoData();
        System.out.println("----------------------------------");

        transaksi2.idTransaksi = "TR002";
        transaksi2.namaPeminjam = "Andi";
        transaksi2.judulBuku = "Metode Numerik";
        transaksi2.jmlHariTerlambat = 3;
        transaksi2.tampilInfoData();
        System.out.println("----------------------------------");

        transaksi3.idTransaksi = "TR003";
        transaksi3.namaPeminjam = "Lia";
        transaksi3.judulBuku = "Pemrograman Java";
        transaksi3.jmlHariTerlambat = 10;
        transaksi3.tampilInfoData();
    }
}
