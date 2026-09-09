package P2;

public class TestMataKuliah {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        MataKuliah mk2 = new MataKuliah();
        MataKuliah mk3 = new MataKuliah();

        mk1.kodeMK = "MK001";
        mk1.namaMK = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.nilaiAngka = 4.0;
        mk1.tampilData();
        System.out.println("----------------------");

        mk2.kodeMK = "MK002";
        mk2.namaMK = "Basis Data";
        mk2.sks = 2;
        mk2.nilaiAngka = 3.5;
        mk2.tampilData();
        System.out.println("----------------------");

        mk3.kodeMK = "MK003";
        mk3.namaMK = "Aljabar Linier";
        mk3.sks = 2;
        mk3.nilaiAngka = 3.0;
        mk3.tampilData();
        System.out.println("----------------------");

        double totalBobot = mk1.hitungBobotNilai() + 
                            mk2.hitungBobotNilai() +
                            mk3.hitungBobotNilai();
        System.out.println("Total Bobot Nilai : " + totalBobot); 
    }
}
