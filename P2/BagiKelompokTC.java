package P2;

public class BagiKelompokTC {
    public static void main(String[] args) {
        System.out.println("awal program");

        int jumlahMahasiswa = 32;
        int jumlahKelompok = 4;
        int anggotaPerkelompok = 0;
        try {
            anggotaPerkelompok = jumlahMahasiswa / jumlahKelompok;
        } catch (ArithmeticException e) {
            System.out.println("jumlah kelompok tidak boleh nol");
        }

        System.out.println(anggotaPerkelompok);
        System.out.println("akhir program");
    }
}
