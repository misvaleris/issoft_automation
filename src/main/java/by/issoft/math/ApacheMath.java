package by.issoft.math;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ApacheMath {
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


        System.out.println("1. Itersection: "
                + CollectionUtils.intersection(first, second));
        System.out.println("2. Summetric difference: "
                + CollectionUtils.disjunction(first, second));
        System.out.println("3. Union: "
                + CollectionUtils.union(first, second));
        System.out.println("4. Subtract function: "
                + CollectionUtils.subtract(first, second));

    }
}
