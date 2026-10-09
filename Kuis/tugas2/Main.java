package Kuis.tugas2;

import Kuis.tugas1.Laptop;

public class Main {
    public static void main(String[] args) {
        Laboratorium lab = new Laboratorium("Lab Pemrograman 1");

        // Menambahkan laptop
        Laptop lp1 = new Laptop("LP-01", "Asus", 8);
        Laptop lp2 = new Laptop("LP-02", "Lenovo", 16);
        Laptop lp3 = new Laptop("LP-03", "Acer", 4);

        System.out.println("=== TAMBAH LAPTOP ===");
        System.out.println(lab.tambahLaptop(lp1)); // true
        System.out.println(lab.tambahLaptop(lp2)); // true
        System.out.println(lab.tambahLaptop(lp3)); // true

        // Membuat mahasiswa
        Mahasiswa andi = new Mahasiswa("2341720001", "Andi");
        Mahasiswa budi = new Mahasiswa("2341720002", "Budi");

        System.out.println("\n=== PEMINJAMAN ANDI ===");

        Peminjaman p1 = lab.pinjamkan(andi, "LP-01");
        System.out.println(p1 != null); // true

        // Meminjam laptop yang sama
        Peminjaman p2 = lab.pinjamkan(andi, "LP-01");
        System.out.println(p2 == null); // true

        // Andi meminjam laptop kedua
        Peminjaman p3 = lab.pinjamkan(andi, "LP-02");
        System.out.println(p3 != null); // true

        // Andi sudah mencapai batas 2 laptop
        Peminjaman p4 = lab.pinjamkan(andi, "LP-03");
        System.out.println(p4 == null); // true

        System.out.println("Jumlah pinjaman aktif Andi: "
                + lab.jumlahPinjamanAKtif(andi)); // 2

        System.out.println("\n=== PEMINJAMAN BUDI ===");

        // Budi masih boleh meminjam LP-03
        Peminjaman p5 = lab.pinjamkan(budi, "LP-03");
        System.out.println(p5 != null); // true

        System.out.println("\n=== PENGEMBALIAN ===");

        System.out.println(lab.kembalikan("LP-01")); // true
        System.out.println(lab.kembalikan("LP-01")); // false

        System.out.println("Jumlah pinjaman aktif Andi: "
                + lab.jumlahPinjamanAKtif(andi)); // 1

        // Andi sekarang boleh meminjam laptop lagi
        Peminjaman p6 = lab.pinjamkan(andi, "LP-03");
        System.out.println(p6 == null); // true, karena LP-03 dipinjam Budi

        System.out.println("\n=== STATUS LAPTOP ===");

        for (Laptop lp : lab.getdaftarLaptop()) {
            System.out.println(lp.info());
        }
    }
}

