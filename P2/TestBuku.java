package P2;

public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        // buku1.penerbit = "Andi Offset";
        buku1.tahunTerbit = 2021;
        try {
            buku1.tampikanInfoBuku();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        }
        System.out.println("-----------------------------------");

        Buku buku2 = new Buku();
        buku2.isbn = "978-623-4567-89-0";
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.penulis = "Rosa A.S";
        buku2.penerbit = "Gramedia";
        buku2.tahunTerbit = 2023;
        buku2.tampikanInfoBuku();
        System.out.println("-----------------------------------");

        Buku buku3 = new Buku();
        buku3.isbn = "978-623-1234-56-7";
        buku3.judul = "Pemrograman Java Untuk Pemula";
        buku3.penulis = "Jubilee Enterprise";
        buku3.penerbit = "Elex Media Kokmputido";
        buku3.tahunTerbit = 2020;
        buku3.tampikanInfoBuku();
    }
}
