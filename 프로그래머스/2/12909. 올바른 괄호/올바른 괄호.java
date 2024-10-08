import java.util.Stack;

public class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> stack.push(c);
                case ')' -> {
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
        
/*
        int counter = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> counter++;
                case ')' -> {
                    if (counter-- == 0) return false;
                }
            }
        }

        return counter == 0;
*/
    }
}