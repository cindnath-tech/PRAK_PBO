package Kuis.tugas2;

import Kuis.tugas1.Laptop;

public class Peminjaman {
    private Mahasiswa mahasiswa;
    private Laptop laptop;
    private boolean aktif;

    public Peminjaman(Mahasiswa m, Laptop lp) {
        mahasiswa = m;
        laptop = lp;
        this.aktif = true;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void selesai() {
        aktif = false;
    }
}
