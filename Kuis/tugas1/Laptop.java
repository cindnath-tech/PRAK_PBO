package Kuis.tugas1;

public class Laptop {
    private String kodeAset;
    private String merk;
    private int ramGB;
    private boolean tersedia;

    private static boolean ramValid(int ram) {
        return ram == 4 || ram == 8 || ram == 16 || ram == 32; //memeriksa apakah kapasistas RAM valid
    }

    public Laptop(String kodeAset, String merk, int ramGB) {
        if (kodeAset == null || !kodeAset.startsWith("LP-")) {
            throw new IllegalArgumentException("Kode aset tidak valid"); //pengecekan kode aset (jik LP maka valid)
        }

        if (merk == null || merk.isBlank()) {
            throw new IllegalArgumentException("Merk tidak valid"); // jika merk kosong maka tidak valid
        }

        if (!ramValid(ramGB)) {
            throw new IllegalArgumentException("RAM tidak valid");
        }

        this.kodeAset = kodeAset;
        this.merk = merk;
        this.ramGB = ramGB;
        this.tersedia = true;
    }

    public String getKodeAset() {
        return kodeAset;
    }

    public String getMerk() {
        return merk;
    }

    public int getRamGB() {
        return ramGB;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public boolean pinjam() {
        if (tersedia) {
            tersedia = false;
            return true;
        }
        return false;
    }

    public void kembalikan() {
        if (!tersedia) {
            tersedia = true;
        } else {
            throw new IllegalStateException("Laptop sudah tersedia");
        }
    }

    public void upgradeRam(int ramBaru) {
        if (!ramValid(ramBaru) || ramBaru <= ramGB) {
            throw new IllegalArgumentException("RAM upgrade tidak valid");
        } // memeriksa apakah rambaru valid dan rambaru harus lebih besar dari ramGB 
        ramGB = ramBaru;
    }

    public String info() {
        String status;
        if (tersedia) {
            status = "tersedia";
        } else {
            status = "dipinjam";
        }
        return kodeAset + " | " + merk + " | " + ramGB + " GB | " + status;
    }
}
