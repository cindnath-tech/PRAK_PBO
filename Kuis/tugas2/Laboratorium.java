package Kuis.tugas2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Kuis.tugas1.Laptop;

public class Laboratorium {
    private String nama;
    private List<Laptop> daftarLaptop;
    private List<Peminjaman> riwayat;
    private static final int MAKS_PINJAM = 2; //nilai tidak dapat diubah setelah dinisialisasi

    public Laboratorium(String nama) {
        this.nama = nama;
        this.daftarLaptop = new ArrayList<>(); //membuat daftar laptop kosong
        this.riwayat = new ArrayList<>(); //membuat daftar riwayat
    }

    public boolean tambahLaptop(Laptop lp) {
        if (lp == null || cariLaptop(lp.getKodeAset()) != null) {
            return false; //pengecekan kalo objek lp null atau kode laptop ada di daftar maka gagal
        }
        daftarLaptop.add(lp); //jika tidak memenuhi maka penambahan berhasil
        return true;
    }

    public Laptop cariLaptop(String kodeAset) {
        for (Laptop lp : daftarLaptop) { //memerikasa semua objek yang ada di daftar
            if (lp.getKodeAset().equals(kodeAset)) { //mengambil kode dan membandingkan kode tersebut dengan kode yg dicari
                return lp; //mengembalikan objek yg ditemukan
            }
        }
        return null;
    }

    public int jumlahPinjamanAktif(Mahasiswa m) {
        if (m == null) {
            return 0;
        }

        int jumlah = 0;
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getMahasiswa().getNim().equals(m.getNim())) {
                jumlah++; //peminajaman aktif dan nim mhs sama dgn nim yg diperiksa maka menambah perhitungan
            }
        }
        return jumlah;
    }

    public Peminjaman pinjamkan(Mahasiswa m, String kodeAset) {
        Laptop lp = cariLaptop(kodeAset); //mencari laptop sesuai dgn kode yg dikasih

        if (m == null || lp == null || !lp.isTersedia() || jumlahPinjamanAktif(m) >= MAKS_PINJAM) {
            return null; //memeriksa semua syarat jika salah satu terpenuhi maka peminjaman gagal
        }

        if (lp.pinjam()) {
            Peminjaman p = new Peminjaman(m, lp);
            riwayat.add(p);
            return p;
        }
        return null;
    }

    public boolean kembalikan(String kodeAset) {
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getLaptop().getKodeAset().equals(kodeAset)) {
                p.selesai();
                p.getLaptop().kembalikan();
                return true;
            }
        }
        return false;
    }

    public List<Laptop> getDaftarLaptop() {
        return Collections.unmodifiableList(daftarLaptop);   
    }
}
