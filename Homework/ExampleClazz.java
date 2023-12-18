package Homework;

public class ThamTriFeatThamChieu {

    public static void main(String[] args) {
        int example = 100; //khai báo biến example
        ThamTriFeatThamChieu thamTriFeatThamChieu = new ThamTriFeatThamChieu(10, "Thien"); //khai báo obj


        System.out.println("before: " + thamTriFeatThamChieu); //@6acbcfc0
        System.out.println("before: " + example); //100

        System.out.println("-------------");

        pointChanger(thamTriFeatThamChieu, example); // khi vào hàm giá trị

        System.out.println("after: " + thamTriFeatThamChieu); //@6acbcfc0
        System.out.println("after: " + example); //100

    }

    static void pointChanger(ThamTriFeatThamChieu thamTriFeatThamChieu, int newPoint) {
        newPoint = newPoint * 2;
        System.out.println("newPoint inside method: " + newPoint); //ở đây giá trị đc thay đổi thành 200
        thamTriFeatThamChieu.setPoint(newPoint);
        System.out.println(thamTriFeatThamChieu.getPoint());
    }

    private int point;
    private String name;

    public ThamTriFeatThamChieu(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public ThamTriFeatThamChieu() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
