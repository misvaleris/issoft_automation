package by.issoft.math;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("Vova");
        first.add("Olya");
        first.add("Sasha");
        List<String> second = new ArrayList<>();
        second.add("Sasha");
        second.add("Petya");
        second.add("Katya");
        second.add("Nick");
        second.add("Sveta");

        List<String> intersectionResult = intersection(first, second);
        System.out.println("1. Intersection function " + intersectionResult);
        List<String> symmetricResult = symmetric(first, second);
        System.out.println("2. Summetric function " + symmetricResult);
        List<String> unionResult = union(first, second);
        System.out.println("3. Union function " + unionResult);
        List<String> subtractResult = subtract(first, second);
        System.out.println("4. Subtract function " + subtractResult);
    }

    public static List<String> intersection(List<String> fist, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String item : fist) {
            for (String item2 : second) {
                if (item.equals(item2)) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public static List<String> symmetric(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first); //если добавить в скобках значение, то можно не писать логику в 43-45 строчке, программа это делать автоматически
        // for (String item : first) {
        //    result.add(item);
        // }
        result.addAll(second); //добавить второй перебор
        for (String item2 : second) {
            //  boolean contains = result.contains(item2);
            if (result.contains(item2)) { //вместо 48 строчки
                result.remove(item2);
            } else {
                result.add(item2);
            }
        }
        return result;
    }

    public static List<String> union(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(second);
        for (String item : first) {
            boolean notContains = !result.contains(item);
            if (notContains) {
                result.add(item);
            }
        }
        return result;

    }

    public static List<String> subtract(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);
        //   for (String item : first) {
        //       result.add(item);
        //   }
        for (String item2 : second) {
            //     boolean contains = result.contains(item2);
            result.remove(item2);
        }
        return result;
    }
}