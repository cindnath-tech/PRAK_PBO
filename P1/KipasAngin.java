package P1;

public class KipasAngin {
    private String brand;
    private int level = 1;

    private final int[] FAN_LEVELS = {1, 2, 3};

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void levelChanges(int levelValues) {
        level = FAN_LEVELS[levelValues - 1];
    }

    public void levelUp() {
        level++;
    }

    public void levelDown() {
        level--;
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Level : " + level);
    }
}
