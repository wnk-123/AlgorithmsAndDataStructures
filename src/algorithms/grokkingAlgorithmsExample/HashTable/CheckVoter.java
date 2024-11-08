package algorithms.grokkingAlgorithmsExample.HashTable;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    private static final Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String name) {
        if (voted.containsKey(name)) {
            System.out.println("Kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("Let them vote!");
        }
    }
}
