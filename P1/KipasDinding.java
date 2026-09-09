package P1;

public class KipasDinding extends KipasAngin {
    private int angle;

    public void setAngle(int angleValue) {
        angle = angleValue;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Angle : " + angle);
        System.out.println("Fan Type : Kipas Dinding");
    }
}
