package P6.tugas;

public class Tugas {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("001", "Budi", "Surabaya");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("002", "Sari", "Malang");
        dosen2.setSKS(9);

        DaftarGaji daftar = new DaftarGaji(2);
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        daftar.printSemuaGaji();
    }
}
