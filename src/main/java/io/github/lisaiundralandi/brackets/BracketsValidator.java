package io.github.lisaiundralandi.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsValidator {
    private final Deque<Character> brackets = new ArrayDeque<>();

    public boolean validate(String input) {
        brackets.clear();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!checkChar(c)) {
                return false;
            }
        }
        return brackets.isEmpty();
    }

    private boolean checkChar(char c) {
        if (c == '(' || c == '[' || c == '{') {
            brackets.push(c);
        }
        if (c == ')' || c == ']' || c == '}') {
            if (brackets.isEmpty()) {
                return false;
            }

            char lastBracket = brackets.pop();
            if (c == ')' && lastBracket != '(') {
                return false;
            }
            if (c == ']' && lastBracket != '[') {
                return false;
            }
            return c != '}' || lastBracket == '{';
        }
        return true;
    }
}
