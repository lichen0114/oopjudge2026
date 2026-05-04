import java.util.Stack;

/**
 * Validates whether a string of parentheses, brackets, and braces is properly matched.
 */
public class ParenthesisMatcher {

    /**
     * Determines whether the given string contains valid, properly nested brackets.
     * <p>
     * Supported bracket types are: {@code ()}, {@code []}, and {@code {}}.
     * Each opening bracket must have a corresponding closing bracket of the same type,
     * and brackets must be closed in the correct order.
     *
     * @param s the string to validate
     * @return {@code true} if every opening bracket has a matching closing bracket
     *         in the correct order; {@code false} otherwise
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If it is an opening bracket, push it into stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // If it is a closing bracket
            else if (ch == ')' || ch == ']' || ch == '}') {

                // No opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check whether the type matches
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Valid only if every opening bracket is matched
        return stack.isEmpty();
    }
}
