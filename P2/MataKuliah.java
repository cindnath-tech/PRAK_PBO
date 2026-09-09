package P2;

public class MataKuliah {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public double nilaiAngka;

    public double hitungBobotNilai() {
        return sks * nilaiAngka;
    }

    public void tampilData(){
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama Mk     : " + namaMK);
        System.out.println("SKS         : " + sks);
        System.out.println("Nilai Angka : " + nilaiAngka);
        System.out.println("Bobot Nilai : " + hitungBobotNilai());
    }
}
