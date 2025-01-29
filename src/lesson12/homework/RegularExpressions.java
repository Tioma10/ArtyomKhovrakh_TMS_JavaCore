package lesson12.homework;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        getSolutionTaskOne();
    }


    public static void getSolutionTaskOne() {
        System.out.print("Enter string: ");
        String input = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}


