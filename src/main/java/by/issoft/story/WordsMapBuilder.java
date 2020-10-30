package by.issoft.story;

import java.util.HashMap;
import java.util.Map;

public class WordsMapBuilder {
    public Map<String, Integer> buildDictionary(String words) {
        //сначала удаляем все символы переводы строки, а потом вырезаем слова
        String withoutEnter = words.replaceAll("\\n+", " ");
        String[] splitWords = withoutEnter.split("[^A-Za-zА-Яа-я]+");
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : splitWords) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
        return occurrences;
    }
}

