package Quiz.WeeklyQuiz.Week4;

import java.util.Scanner;
import java.util.Stack;

public class WeeklyQuiz {
    static boolean solution(String s) {
        boolean check = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (!(stack.isEmpty())) {
            check = false;
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
