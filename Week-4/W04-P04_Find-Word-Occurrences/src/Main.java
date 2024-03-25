import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");
        input = sc.nextLine().trim();
        sc.close();

        MaxOccurrenceWord(input);
    }

    public static void MaxOccurrenceWord(String input) {
        String maxOccuredWord = null;
        int count = 1, maxOccurence = 0;
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] strArr = input.split("\\s+");

        for (String str : strArr) {
            if (!wordCount.containsKey(str)) {
                wordCount.put(str, count);
            } else {
                wordCount.replace(str, wordCount.get(str) + 1);

                if (wordCount.get(str) >= maxOccurence) {
                    maxOccurence = wordCount.get(str);
                    maxOccuredWord = str;
                }
            }
        }

        System.out.println("Max occurred word: " + maxOccuredWord + "\nCount: " + maxOccurence);
    }
}