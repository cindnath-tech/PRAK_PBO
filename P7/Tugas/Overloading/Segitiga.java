package P7.Tugas.Overloading;

public class Segitiga {
    int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(
            Math.pow(sisiA, 2) + Math.pow(sisiB, 2)
        );
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Suduut ketiga : " + s.totalSudut(60));
        System.out.println("Sudut ketiga : " + s.totalSudut(60, 70));
        System.out.println("Keliling segitiga : " + s.keliling(3, 4, 5));
        System.out.println("Sisi Miring : " + s.keliling(3, 4));
    }
}
