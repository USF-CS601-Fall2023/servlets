package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroupsExercise {
    public static void extractLastNameAndPhone(String line) {
        Pattern pattern = Pattern.compile("([A-Z][a-z]*)\\s([A-Za-z]+(\\s[A-Za-z]+)*)\\s([1-9]\\d{2}-\\d{3}-\\d{4})");
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            System.out.println(matcher.group(2) + ": " + matcher.group(4));
        }
    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/regex/namesAndPhones"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                extractLastNameAndPhone(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

   /* public static void test() {
        Pattern p = Pattern.compile("(?=.*\\d)(?=.*[A-Z])(.+){8,}");
        Matcher m = p.matcher("hs8g$Ahn");
        if (m.matches()) {
            System.out.println("Valid");
        }

    }

    */
}
