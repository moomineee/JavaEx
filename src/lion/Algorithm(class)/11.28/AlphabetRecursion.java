package javalion.week11.day1;

public class PrintAlphabetRecursion {

    public static void alphabetRecursion(String prefix, int length) {
        if (prefix.length() == length) {
            // (2) 특정 길이가 되면 그 문자열을 출력한다.
            System.out.println(prefix);
            return;
        }
        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet(prefix + c, length);
            // (1) 특정 길이가 될 때까지 prefix + c를 이용해 prefix를 갱신해준다. (String + char -> String)
        }
    }

    public static void main(String[] args) {
        PrintAlphabetRecursion printAlphabetRecursion = new PrintAlphabetRecursion();
        printAlphabet("", 3);
    }
}
