package P1;

public class KipasBerdiri extends KipasAngin{
    private int height;

    public void setHeight(int heightValue) {
        height = heightValue;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Height : " + height + " cm");
        System.out.println("Fan Type : Kipas Berdiri");
    }
}
