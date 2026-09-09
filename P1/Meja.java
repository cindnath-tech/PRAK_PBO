package P1;

public class Meja {
    private String bahan;
    private int ukuran;

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void printInfo() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Ukuran : " + ukuran + " cm");
        System.out.println("Type : Meja");
    }
}
