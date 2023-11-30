package Coding.Day2No10;

import java.util.ArrayList;
import java.util.List;

public class DoWriteObject {
    private static final String CUSTOMER_FILE_PATH = "\\storage\\src\\data\\customer.csv";
    public static void main(String[] args) {
        Customer customer = new Customer(1L, "Voldemort", "Hogwarts");
        List<String> customerList = new ArrayList<>();
        customerList.add(customer.getInfoToCSV());
        WriteObjectToCSV.writeObjectToCSV(customerList, CUSTOMER_FILE_PATH, false);
    }
}
