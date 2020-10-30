package by.issoft.story;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        TextReader textReader = new TextReader();
        // textReader.readTextFromFile("src/main/resources/newStory");
        String text = textReader.readTextFromFile("src/main/resources/newStory");
        WordsMapBuilder wordsMapBuilder = new WordsMapBuilder();
        Map<String, Integer> dictionary = wordsMapBuilder.buildDictionary(text);
        Top10 top10 = new Top10();
        top10.showTop10(dictionary);


    }
}
