package esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(esercizio1.Main.class);

    public static void main(String[] args) {
        Map<String, Integer> addressBook = new HashMap<>();
        addContact(addressBook, "Fabio", 1000);
        addContact(addressBook, "Andrea", 2000);
        addContact(addressBook, "Luca", 3000);
        addContact(addressBook, "Giulia", 4000);
        deleteContact(addressBook, "Giulia");
        searchByName(addressBook, "Fabio");
        searchByNumber(addressBook, 3000);
        System.out.println(addressBook);
    }

    public static void addContact(Map map, String name, Integer number) {
        map.put(name, number);
    }

    public static void deleteContact(Map map, String name) {
        map.remove(name);
    }

    public static void searchByName(Map map, String name) {
        System.out.println("Il numero di telefono di " + name + " è " + map.get(name));
    }

    public static <K, V> K searchByNumber(Map<K, V> map, V number) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(number)) {
                System.out.println("Il nome di " + number + " è " + entry.getKey());
            }
        }
        return null;
    }
}
