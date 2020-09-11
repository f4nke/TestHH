import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSwap());

}

    public static int checkSwap() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fullString;
        String[] str;

        while (true) {
            fullString = in.readLine();
            str = fullString.split(" ");
            if (!fullString.matches("^[а-я]+\\s[а-я]+$")) {
                System.out.println("Требются буквы русского алфавита и один пробел. Попробуй еще раз");
            } else if (str[0].length() != str[1].length()){
                System.out.println("Строки разной длины. Попробуйте снова");
            } else
                break;
        }
        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 0; j < str[1].length(); j++) {
                if ((str[0].charAt(i) == str[0].charAt(j) && str[1].charAt(i) != str[1].charAt(j)) ||
                        (str[0].charAt(i) != str[0].charAt(j) && str[1].charAt(i) == str[1].charAt(j))) {
                    return -1;
                }
            }
        }
        return 1;
    }
}