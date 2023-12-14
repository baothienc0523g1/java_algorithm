package Homework;

public class Question4 implements Comparable<Question4> {
    /**
     * 1: Comparable triển khai trực tiếp trong class, cho biết cách mặc định mà 2 object của class đó sẽ so sánh,
     * khi triển khai comparable thì có thể dùng phương thức sort của lớp Collections để sắp xếp
     *
     * 2: Comparator triển khai trong một class riêng, dùng để so sánh 2 object theo cách mong muốn
     *
     * 3: Comparable chỉ có thể triển khai 1 lần, Comparator có thể triển khai nhiều lần dựa vào các tiêu chí
     * so sánh mong muốn*/

    private Integer id;
    private String name;

    public Question4(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Question4() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Question4 o) {
        return this.id - o.id;
    }
}
