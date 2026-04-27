import java.util.LinkedHashSet;

public class SentenceProcessor {

    public String removeDuplicatedWords(String sentence) {
        String[] words = sentence.split(" ");
        LinkedHashSet<String> seen = new LinkedHashSet<>();
        for (String word : words) {
            seen.add(word);
        }
        return String.join(" ", seen);
    }

    public String replaceWord(String target, String replacement, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) sb.append(" ");
            if (words[i].equals(target)) {
                sb.append(replacement);
            } else {
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}
