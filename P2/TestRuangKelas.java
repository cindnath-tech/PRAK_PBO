package P2;

public class TestRuangKelas {
    public static void main(String[] args) {
        RuangKelas ruang1 = new RuangKelas();

        ruang1.kodeRuang = "LAB01";
        ruang1.namaGedung = "Gedung JTI";
        ruang1.kapasitas = 40;
        ruang1.jumlahMahasiswa = 32;
        ruang1.tampilData();
    }
}
