package Homework;

public class ExampleClazz {

    public static void main(String[] args) {
        int example = 100; //khai báo biến example
        ExampleClazz exampleClazz = new ExampleClazz(10, "Thien"); //khai báo obj

        System.out.println("before: " + exampleClazz); //@6acbcfc0
        System.out.println("before: " + example); //100

        pointChanger(exampleClazz, example); // khi vào hàm giá trị của biến example được thay đổi

        System.out.println("after: " + exampleClazz); //@6acbcfc0
        System.out.println("after: " + example); //100
    }

    static void pointChanger(ExampleClazz exampleClazz, int newPoint) {
        newPoint = newPoint * 2;
        System.out.println("newPoint inside method: " + newPoint); //ở đây giá trị đc thay đổi thành 200
        exampleClazz.setPoint(newPoint);
        System.out.println("exampleClazz point inside method: " + exampleClazz.getPoint()); //point của object = 200
    }

    private int point;
    private String name;

    public ExampleClazz(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public ExampleClazz() {
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
