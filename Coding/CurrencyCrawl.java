package Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyCrawl {
    public static String currencyCrawl() {
        StringBuilder result = new StringBuilder();
        try {
            URL CRAWL_URL = new URL("https://www.24h.com.vn/ty-gia-ngoai-te-ttcb-c426.html");
            URLConnection urlConnection = CRAWL_URL.openConnection();

            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String pointer;
            while ((pointer = bufferedReader.readLine()) != null) {
                result.append(pointer);
            }

            Pattern pattern = Pattern.compile("<span.[USD]*?</strong>");
            Matcher matcher = pattern.matcher(result);

            ArrayList<String> arrayList = new ArrayList<>();
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }

            String[] temp;
            List<String> results = new ArrayList<>();
            for(String s : arrayList) {
                temp = s.split("htm\">");
                results.add(temp[1].substring(0, temp[1].length() - 9));
            }

            for (String s : results) {
                System.out.println(s.replaceAll("&quot;","\"").trim());
            }

        } catch (IOException e) {
            System.out.println("IOException while crawling URL: {}" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception while crawling URL: {}" + e.getMessage());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(currencyCrawl());
    }
}
