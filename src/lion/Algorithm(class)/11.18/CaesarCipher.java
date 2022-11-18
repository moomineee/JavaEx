package javalion.week9.day5;
// 소문자는 소문자로, 대문자는 대문자로 루프가 돌아야 한다.
// (대문자와 소문자의 아스키코드에서의 간격 + 밀려난 간격n)을 26으로 나눈 나머지 = 루프를 돌고난 후의 차이 -> 밀린 간격
public class CaesarCipher {

    public String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                answer += (char)('a' + (ch + n - 'a') % 26);
            } else {
                answer += (char)('A' + (ch + n - 'A') % 26);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

    }
}
