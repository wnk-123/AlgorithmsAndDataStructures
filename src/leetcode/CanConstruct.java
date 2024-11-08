package leetcode;

public class CanConstruct {

    private static boolean canConstruct(String ransomNote, String magazine) {
        // Создаем массив для подсчета символов в magazine
        int[] charCount = new int[26];

        // Подсчитываем символы в magazine
        for (char c: magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Проверяем, хватает ли символов для ransomNote
        for (char c: ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {  // если символа не хватает, возвращаем false
                return false;
            }
            charCount[c - 'a']--;           // уменьшаем количество доступных символов
        }
        return true;                        // если хватило всех символов, возвращаем true
    }
}
