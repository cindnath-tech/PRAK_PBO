package P4.id.ac.polinema.relasiclass.tugas;

public class Layanan {
    private String nama;
    private double hargaPerKg;

    public Layanan(String nama, double hargaPerKg) {
        this.nama = nama;
        this.hargaPerKg = hargaPerKg;
    }

    public void info() {
        System.out.println("Layanan: " + nama);
        System.out.println("Harga Per KG: " + hargaPerKg + " /kg");
    } 
}
