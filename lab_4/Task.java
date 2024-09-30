import java.util.Scanner;

//Вводится строка состоящая из 2 или более слов. Нужно вывести все те слова, в которых встречаются цифры или символы пунктации.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();


        String[] words = input.split("\\s+");


        for (String word : words) {
            if (DigitOrPunct(word)) {
                System.out.println(word);
            }
        }
    }

    // проверка наличия цифр или пунктуации
    public static boolean DigitOrPunct(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch) || isPunctuation(ch)) {
                return true;
            }
        }
        return false;
    }

    // проверка является ли символ пунктуацией
    public static boolean isPunct(char ch) {
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(ch) >= 0;
    }
}
