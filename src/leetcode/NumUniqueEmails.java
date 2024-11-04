package leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {

    private static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String e: emails) {
            String[] parts = e.split("@");
            String localName = parts[0];
            String withoutDots = localName.replaceAll("\\.", "");

            int indexOfPlus = withoutDots.indexOf("+");
            String finalNormalizedLocalName = null;

            if (indexOfPlus != -1) {
                finalNormalizedLocalName = withoutDots.substring(0, indexOfPlus);
            } else {
                finalNormalizedLocalName = withoutDots;
            }
            String normalizedEmail = finalNormalizedLocalName + "@" + parts[1];
            uniqueEmails.add(normalizedEmail);
        }
        return uniqueEmails.size();
    }
}
