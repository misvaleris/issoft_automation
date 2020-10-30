package by.issoft.story;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Top10 {
    public void showTop10(Map<String, Integer> dictionary) {
        ValueComparator bvc = new ValueComparator(dictionary);
        Map<String, Integer> sortMap = new TreeMap<>(bvc);
        sortMap.putAll(dictionary);
        sortMap.entrySet()
                .stream().limit(10)
                .forEach(System.out::println);
    }

    // класс для сортировки
    class ValueComparator implements Comparator<String> {

        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with equals.
        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }
}
