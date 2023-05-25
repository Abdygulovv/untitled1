import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("начало 1 - задания");//
        //первый задания
        // первый вариант
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9991);
        numbers.add(821923);
        numbers.add(2832);
        numbers.add(22);
        numbers.add(1120);
        numbers.add(9);
        numbers.add(3);
        numbers.add(33);
        numbers.add(1233);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("--------");

        //второй вариант-----

        ArrayList<Integer> numbers1 = new ArrayList<>();
        System.out.println(numbers1);
        for (int i : new int[]{9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233}) {
            numbers1.add(i);

            Collections.sort(numbers1);
            System.out.println(numbers1);
        }


        System.out.println("начало 2 - задания");//
        //второй задания
        int numbers2[] = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};

        for (int number : numbers2) {
            if (number % 2 == 0) {
                System.out.println("четный число: " + number);
            }
        }
        System.out.println("-----");

        for (int number : numbers2) {
            if (number % 2 != 0) {
                System.out.println("не четный число: " + number);
            }

        }


        System.out.println("начало 3 - задания");
        //третий задания
        int[] numbers3 = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};

        int sum = 0;
        int multiplication = 1;

        for (int number : numbers3) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                multiplication *= number;
            }
        }

        System.out.println("Сумма четных чисел: " + sum);
        System.out.println("Нечетных чисел: " + multiplication);


        System.out.println("начало 4 - задания ");
        //четвертый задания
        String words = "переменная функция метод аргумент параметр привязка длина высота размер";
        String vowels = "";
        String consonants = "";

        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            String lowercaseWord = word.toLowerCase().replaceAll("\\s+", "");
            for (char letter : lowercaseWord.toCharArray()) {
                if (isVowel(letter)) {
                    vowels += letter;
                } else {
                    consonants += letter;
                }
            }
        }

        System.out.println("Гласные буквы: " + vowels);
        System.out.println("Согласные буквы: " + consonants);
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return "аеёиоуыэюя".indexOf(letter) != -1;
    }

    {
        System.out.println("начало 5 - задания ");
        //пятый задания

        String words = "java kotlin python javascript nodejs go react react native swift";
        String vowels = "";
        String consonants = "";

        String[] wordArray = words.split(" ");

        for (String word : wordArray) {
            String lowercaseWord = word.toLowerCase().replaceAll("\\s+", "");

            for (char letter : lowercaseWord.toCharArray()) {
                if (isVowel(letter)) {
                    vowels += letter;
                } else {
                    consonants += letter;
                }
            }
        }

        System.out.println("Гласные буквы: " + vowels);
        System.out.println("Согласные буквы: " + consonants);

        String word1 = createWordFromLetters("Java", vowels);
        String word2 = createWordFromLetters("Java", consonants);

        System.out.println("Слово 1: " + word1);
        System.out.println("Слово 2: " + word2);
    }


    public static boolean isVowel1(char letter) {
        letter = Character.toLowerCase(letter);
        return "aeiouаеёиоуыэюя".indexOf(letter) != -1;
    }
    public static String createWordFromLetters(String baseWord, String letters) {
        StringBuilder wordBuilder = new StringBuilder();
        for (char letter : baseWord.toCharArray()) {
            if (letters.indexOf(Character.toLowerCase(letter)) != -1) {
                wordBuilder.append(letter);
            }
        }

        return wordBuilder.toString();
    }
}