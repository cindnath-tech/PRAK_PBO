package P7.Tugas.Overriding;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia dapat bernafas");
    }

    public void makan() {
        System.out.println("Manusia dapat makan");
    }
}

class Dosen extends Manusia {
    @Override 
    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    public void lembur() {
        System.out.println("Doseng sedang lembur");
    }
}

class Mahasiswa extends Manusia {
    @Override 
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        System.out.println("=== Dosen ===");
        m1.bernafas();
        m1.makan();

        System.out.println("=== Mahasiswa ===");
        m2.bernafas();
        m2.makan();
    }
}