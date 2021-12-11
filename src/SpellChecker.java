import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {

    public static String[] getDictionary() throws IOException {
        String[] dictionary = new String[61336];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (scan.hasNext()) {
            dictionary[count] = scan.next();
            count++;
        }
        return dictionary;
    }

    public static boolean wordInDictionary(String word, String[] dictionary) {
        int min = 0;
        int max = dictionary.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (dictionary[mid].compareTo(word) == 0) {
                return true;
            } else if (dictionary[mid].compareTo(word) > 0) {
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return false;

    }

    public static void main(String[] args) throws IOException {
        String[] dictionary = getDictionary();
        Scanner scan = new Scanner(new File("files/alice.txt"));
        Scanner scanTwo = new Scanner(System.in);
        FileWriter fw = new FileWriter("files/corrected.txt");

        int count = 0;
        while (scan.hasNext()) {
            String word = scan.next();
            if (wordInDictionary(word, dictionary)) {
                fw.write(word + " ");
            } else {
                System.out.println("Would you like to fix the spelling of " + word + " ? Type y or n");
                if (scanTwo.nextLine().compareTo("y") == 0) {
                    System.out.println("Enter new spelling: ");
                    fw.write(scanTwo.nextLine() + " ");
                } else {
                    fw.write(word + " ");
                }
            }
            count++;
        }
        fw.close();
    }
}






