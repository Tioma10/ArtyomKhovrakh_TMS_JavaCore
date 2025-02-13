package lesson17.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args) {

        getSolutionTaskFive();

    }

    public static void getSolutionTaskOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        String input = scanner.nextLine();
        var birthdayOneHundred = LocalDate.parse(input).plusYears(100);

        System.out.println(birthdayOneHundred);
    }

    public static void getSolutionTaskTwo() {
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        arrayListNumbers.add(1);
        arrayListNumbers.add(-2);
        arrayListNumbers.add(10);
        Predicate<Integer> isPositive = x -> x > 0;
        for (int k : arrayListNumbers) {
            if (isPositive.test(k)) {
                System.out.println(k);
            }
        }
    }

    public static void getSolutionTaskThree(String sum) {
        Function<String, Double> parse = x -> Double.parseDouble(x)/3.2;
        String[] arrayString = sum.split(" ");
        double result = parse.apply(arrayString[0]);
        System.out.println(result + " USD");

    }

    public static void getSolutionTaskFour(String sum){
        Consumer<Double> formatter = x -> System.out.println( x/3.2 + "USD");
        String[] arrayString = sum.split(" ");
        formatter.accept(Double.valueOf(arrayString[0]));

    }

    public static void getSolutionTaskFive(){
        System.out.println("Enter a line: ");

        Supplier<String> supplier = () -> new Scanner(System.in).nextLine();

        StringBuilder line = new StringBuilder(supplier.get());
        System.out.println(line.reverse());

    }

}
