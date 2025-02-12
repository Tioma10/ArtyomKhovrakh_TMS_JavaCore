package lesson16.homework;

import java.util.*;

public class AdvancedCollections {
    public static void main(String[] args) {
        getSolutionTaskOne();
        getSolutionTaskTwo();
        if (getSolutionTaskThree("({())")){
            System.out.println("The string is balanced");
        }

        else{
            System.out.println("The string is not balanced");
        }

    }

    public static void getSolutionTaskOne() {
        ArrayList<String> wordMultiple = new ArrayList<>();
        wordMultiple.add("a");
        wordMultiple.add("b");
        wordMultiple.add("c");
        wordMultiple.add("a");

        Map<String, Boolean> wordMap = new HashMap<>();
        for (String k : wordMultiple) {
            wordMap.put(k, wordMap.containsKey(k));
        }

        System.out.println(wordMap);

    }

    public static void getSolutionTaskTwo() {
        ArrayList<String> pairs = new ArrayList<>();
        pairs.add("code");
        pairs.add("bug");
        Map<String, String> wordMap = new HashMap<>();
        for (String k : pairs) {
            wordMap.put(String.valueOf(k.charAt(0)), String.valueOf(k.charAt(k.length() - 1)));
        }

        for (Map.Entry<String, String> str : wordMap.entrySet()) {
            System.out.printf("%s : %s\n", str.getKey(), str.getValue());
        }

    }

    public static boolean getSolutionTaskThree(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (char k : input.toCharArray()) {
            if (brackets.containsValue(k)) {
                stack.push(k);
            }
            else if (brackets.containsKey(k)){
                if(stack.isEmpty()||stack.pop() != brackets.get(k))
                    return false;
            }
        }

        return stack.isEmpty();
    }

}

