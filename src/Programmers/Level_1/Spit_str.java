import java.util.StringTokenizer;


class Solution {
    public String solution(String s) {
        String answer = "";

        String[] aaa = s.split(" ");

        for (int i = 0; i < aaa.length; i++) {
            for (int j = 0; j < aaa[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += String.valueOf(aaa[i].charAt(j)).toUpperCase();
                } else {
                    answer += String.valueOf(aaa[i].charAt(j)).toLowerCase();
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }


}