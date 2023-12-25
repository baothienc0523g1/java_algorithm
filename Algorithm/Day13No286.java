package Algorithm;

public class Day13No286 {
    private int id;
    private String name;

    public Day13No286(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Day13No286{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void nameChane(Day13No286 day13No286) {
        day13No286 = new Day13No286(1, "Thang");
    }

    public static void main(String[] args) {
        Day13No286 day13No286 = new Day13No286(2, "Thien");

        System.out.println(day13No286.toString());
        nameChane(day13No286);

        System.out.println(day13No286.toString());
    }
}
