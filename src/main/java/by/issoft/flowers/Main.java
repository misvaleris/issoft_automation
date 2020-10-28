package by.issoft.flowers;

public class Main {
    public static void main(String[] args) {

        String[] test2 = new String[5]; //создание массива
        int[] test = new int[5]; //создание массива
        test[2] = 5; //положили в индекс значение
        int[] test4 = new int[]{1, 2, 3, 4}; // создание массива в одну строку

        int[] countNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int minValue = countNumbers[0];
        for (int i = 1; i < countNumbers.length; i = i + 1) { //условие цикла
            if (minValue > countNumbers[i]) { //тело цикла
                minValue = countNumbers[i];
            }
        }
        System.out.println(minValue);
        int maxValue = countNumbers[0];
        for (int i = 1; i < countNumbers.length; i++) {
            if (maxValue < countNumbers[i]) {
                maxValue = countNumbers[i];

            }
        }
        System.out.println(maxValue);
        int positive = 0;
        for (int i = countNumbers.length-1; i >-1; i--) {
            if (countNumbers[i] > 0) {
                positive = positive+countNumbers[i];
            }
        }
        System.out.println(positive);
    }
}
