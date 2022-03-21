package demo;

public class BlackWhiteStone {

    public static void main(String[] args) {
        System.out.println(solution("RRLL"));
    }

    private static String solution(String input) {
        int length = 2;
        int left = 1;
        int right = 1;
        char left_color = 'b';
        for (int i = 0; i < input.length(); i++) {
            length += 1;
            char curr_color = i%2 == 0? 'b' : 'w';
            if ('L' == input.charAt(i)) {
                if (right == 0 && left_color != curr_color) {
                    left = 1;
                    right = length - 1;
                    left_color = curr_color;
                } else if (left_color == curr_color) {
                    left += 1;
                } else {
                    left = length;
                    right = 0;
                    left_color = curr_color;
                }
            } else {
                if (right == 0 && left_color != curr_color) {
                    right = 1;
                    left = length - 1;
                } else if (left_color == curr_color) {
                    left = length;
                    right = 0;
                } else {
                    right += 1;
                }
            }
        }
        int black = left;
        int white = right;
        if(left_color != 'b' && left > 0) {
            black = right;
            white = left;
        }
        return String.format("%s %s", black, white);
    }
}
