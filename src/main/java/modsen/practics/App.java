package modsen.practics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{

    static String dollarsPattern = "toDollars\\((\\d+,\\d+\\)|.)";
    static String rublesPattern = "toRubles\\((\\d+,\\d+\\)|.)";

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile(dollarsPattern);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found: " + str.subSequence(start, end)
                    + " starts at " + start
                    + " and ends at " + (end - 1));
        }
    }
}
