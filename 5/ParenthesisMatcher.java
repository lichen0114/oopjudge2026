public class ParenthesisMatcher {

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
}
