import java.util.HashMap;

/**
 * Simulates a card matching game that supports adding, removing,
 * checking, counting cards, and finding pairs through string commands.
 */
public class CardMatchingGame {

    /**
     * Processes card matching game commands.
     *
     * @param commands an array of command strings
     * @return output produced by commands, separated by new lines
     */
    public static String process(String[] commands) {
        HashMap<Integer, Integer> cards = new HashMap<>();
        StringBuilder output = new StringBuilder();

        int totalCards = 0;

        for (String command : commands) {
            String[] parts = command.trim().split("\\s+");
            String action = parts[0];

            if (action.equals("add")) {
                int n = Integer.parseInt(parts[1]);

                cards.put(n, cards.getOrDefault(n, 0) + 1);
                totalCards++;

            } else if (action.equals("remove")) {
                int n = Integer.parseInt(parts[1]);

                int count = cards.getOrDefault(n, 0);

                if (count == 0) {
                    output.append("Card not found").append("\n");
                } else if (count == 1) {
                    cards.remove(n);
                    totalCards--;
                } else {
                    cards.put(n, count - 1);
                    totalCards--;
                }

            } else if (action.equals("check")) {
                int n = Integer.parseInt(parts[1]);

                if (cards.getOrDefault(n, 0) > 0) {
                    output.append("true").append("\n");
                } else {
                    output.append("false").append("\n");
                }

            } else if (action.equals("count")) {
                output.append(totalCards).append("\n");

            } else if (action.equals("pair")) {
                int pairs = 0;

                for (int count : cards.values()) {
                    pairs += count / 2;
                }

                output.append(pairs).append("\n");
            }
        }

        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        return output.toString();
    }
}