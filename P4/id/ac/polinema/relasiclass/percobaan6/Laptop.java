package P4.id.ac.polinema.relasiclass.percobaan6;

public class Laptop {
    private String merk;
    private Printer printerDefault;

    public Laptop(String merk, Printer printerDefault) {
        this.merk = merk;
        this.printerDefault = printerDefault;
    }

    public void cetakDokumen(Printer printer, String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
        printerDefault.cetak(namaFile);
    }
}
