package BTH1;

import org.omg.Dynamic.Parameter;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmailExample {

    public static void main(String args[]) {
      String email="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        System.out.println("Nhap email:");
        Scanner scanner=new Scanner(System.in);
        String emailString=scanner.nextLine();
        Pattern pattern=Pattern.compile(email);
        Matcher matcher= pattern.matcher(emailString);
        System.out.println("Email: "+matcher.matches());
    }

}
