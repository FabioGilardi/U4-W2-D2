package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(esercizio1.Main.class);

    public static void main(String[] args) {

//      CREAZIONE ARRAY LIST
        List<String> stringList = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose the number of words:");
        int listSize = Integer.parseInt(myScanner.nextLine());
        if (listSize > 0) {
            for (int i = 0; i < listSize; i++) {
                System.out.println("You have to insert " + (listSize - i) + " words (one a time)");
                String word = myScanner.nextLine();
                stringList.add(word);
            }
            System.out.println(stringList);
        } else {
            logger.error("The number must be more then 0!");
        }
        myScanner.close();

        printDuplicate(stringList);
        listToSet(stringList);
    }

    public static void printDuplicate(List list) {
        Set<Object> duplicateWords = new HashSet<>();
        System.out.println("Here the duplicate words:");
        for (Object word : list) {
            int counter = 0;
            for (Object wordToCompare : list) {
                if (word.equals(wordToCompare)) {
                    counter++;
                    if (counter > 1) {
                        duplicateWords.add(word);
                    }
                }
            }
        }
        for (Object word : duplicateWords) {
            System.out.println(word);
        }
    }

    public static void listToSet(List list) {
        Set<Object> stringSet = new HashSet<>();
        for (Object word : list) {
            stringSet.add(word);
        }
        System.out.println("Number of distinct words: " + stringSet.size());
        System.out.println("These are the distinct words: " + stringSet);
    }
}
