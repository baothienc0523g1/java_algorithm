package Homework;

public class Question2 {
    public static void main(String[] args) {
        Question2 question2 = new Question2(1, "Java");
        System.out.println(question2.getName());
        question2 = null;
        System.out.println(question2.getName());

        /**
         * line 5: khởi tạo đối tượng question2 với các thuộc tính cho trước
         * line 6: in ra thuộc tính name của question2 với method getName()
         * line 7: gán đối tượng question2 = null
         * line 8: khi compile, trình biên dịch cảnh báo "phương thức getName() sẽ cho kết quả là NullPointerException"
         * chạy line 8: Chương trình bị dừng do lỗi NullPointerException
         * */
    }
    private Integer id;
    private String name;

    public Question2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Question2() {
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
}
