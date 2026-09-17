package P3;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("--- Data Kontainer ---");
        System.out.println("Nomor Resi      : " + kontainerAlfa.getNomorResi());
        System.out.println("Nama Pemilik    : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas       : " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dimasukkan: ");
        double beratMasuk = input.nextDouble();
        kontainerAlfa.tambahMuatan(beratMasuk);
        System.out.println("Berat muatan saat ini : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dibongkar : ");
        double beratTurun = input.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun);
        System.out.println("Berat muatan saat ini : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}
