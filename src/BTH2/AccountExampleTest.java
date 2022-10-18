package BTH2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExampleTest {
    public static void main(String[] args) {
        String email= "^[_a-z0-9]{6,}$";
        System.out.println("Nhap count:");
        Scanner scanner=new Scanner(System.in);
        String emailString=scanner.nextLine();
        Pattern pattern=Pattern.compile(email);
        Matcher matcher= pattern.matcher(emailString);
        System.out.println(matcher.matches());
    }
}
