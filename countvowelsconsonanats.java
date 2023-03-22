import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isVowel(letter)) {
                vowels += letter + " ";
            } else if (Character.isLetter(letter)) {
                consonants += letter + " ";
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}