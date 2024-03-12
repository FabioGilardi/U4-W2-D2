package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class Main {
    private static Logger logger = LoggerFactory.getLogger(esercizio1.Main.class);

    public static void main(String[] args) {
        java.util.Set<Integer> randomNumberSet = new TreeSet<>();
        orderedNumbers(randomNumberSet);
        System.out.println(randomNumberSet);


        System.out.println(orderedNumbersTwoWay(randomNumberSet));
        pairOrOdd(randomNumberSet);
    }

    public static void orderedNumbers(Set list) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How long the list shuold be?");
        int listSize = Integer.parseInt(myScanner.nextLine());
        if (listSize > 0) {
            for (int i = 0; i < listSize; i++) {
                Random rndmNumber = new Random();
                list.add(rndmNumber.nextInt(0, 100));
            }
        } else {
            logger.error("The number must be over 0!");
        }
        myScanner.close();
    }

    public static List orderedNumbersTwoWay(Set set) {
        List invertedList = new ArrayList<>();
        List fullList = new ArrayList<>();
        for (Object number : set) {
            invertedList.add(0, number);
        }
        fullList.addAll(set);
        fullList.addAll(invertedList);
        return fullList;
    }

    public static void pairOrOdd(Set set) {
        List<Integer> pairOdd = new ArrayList<>();
        List<Integer> setToList = new ArrayList<>();
        setToList.addAll(set);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type true or false");
        String statement = myScanner.nextLine();
        if (statement == "true") {
            for (int i = 0; i < setToList.size(); i++) {
                if (i % 2 == 0) {
                    pairOdd.add(setToList.get(i));
                }
            }
        } else {
            for (int i = 0; i < setToList.size(); i++) {
                if (i % 2 != 0) {
                    pairOdd.add(setToList.get(i));
                }
            }
        }
        myScanner.close();
        System.out.println(pairOdd);
    }
}
