package Kuis.tugas2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Kuis.tugas1.Laptop;

public class Laboratorium {
    private String nama;
    private List<Laptop> daftarLaptop;
    private List<Peminjaman> riwayat;
    private static final int MAKS_PINJAM = 2;

    public Laboratorium(String nama) {
        this.nama = nama;
        this.daftarLaptop = new ArrayList<>();
        this.riwayat = new ArrayList<>();
    }

    public boolean tambahLaptop(Laptop lp) {
        if (lp == null || cariLaptop(lp.getKodeAset()) != null) {
            return false;
        }
        daftarLaptop.add(lp);
        return true;
    }

    public Laptop cariLaptop(String kodeAset) {
        for (Laptop lp : daftarLaptop) {
            if (lp.getKodeAset().equals(kodeAset)) {
                return lp;
            }
        }
        return null;
    }

    public int jumlahPinjamanAKtif(Mahasiswa m) {
        if (m == null) {
            return 0;
        }

        int jumlah = 0;
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getMahasiswa().getNim().equals(m.getNim())) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public Peminjaman pinjamkan(Mahasiswa m, String kodeAset) {
        Laptop lp = cariLaptop(kodeAset);

        if (m == null || lp == null || !lp.isTersedia() || jumlahPinjamanAKtif(m) >= MAKS_PINJAM) {
            return null;
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

    public List<Laptop> getdaftarLaptop() {
        return Collections.unmodifiableList(daftarLaptop);   
    }
}
