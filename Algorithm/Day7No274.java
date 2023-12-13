package Algorithm;

import java.time.LocalTime;

public class Day7No274 {

    /**
     * input: give 2 string hh:MM:ss
     * output: sum of 2 string above
     */
    static void myLocalTimeConverter(String firstString, String secondString) {
        LocalTime convertedFirstString = LocalTime.parse(firstString);
        LocalTime convertedSecondString = LocalTime.parse(secondString);

        LocalTime result = LocalTime.of(
                convertedFirstString.getHour() + convertedSecondString.getHour(),
                convertedFirstString.getMinute() + convertedSecondString.getMinute(),
                convertedFirstString.getSecond() + convertedSecondString.getSecond(),
                0
        );
        System.out.println(result);
    }

    public static void main(String[] args) {
        myLocalTimeConverter("10:12:00", "08:50:22");
    }
}
