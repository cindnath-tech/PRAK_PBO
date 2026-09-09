package P1;

public class Kursi {
    private String bahan;
    private int tinggi;

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void printInfo() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Tinggi : " + tinggi + " cm");
        System.out.println("Type : Kursi");
    }
}
