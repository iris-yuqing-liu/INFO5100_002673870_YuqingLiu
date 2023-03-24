import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        // Case1 - color
        String Color1  = "#1a2b3c";
        String pattern1 = "^#[0-9a-fA-F]{6}$"; // matches color in hex format
        boolean isMatch1 = Color1.matches(pattern1);
        System.out.println("Color1: " + Color1);
        System.out.println("Positive case: " + (Color1.matches(pattern1) ? "Match found!" : "Match not found."));
        System.out.println("Negative case: " + (!"#1a2b3".matches(pattern1) ? "Match not found." : "Match found!"));
        System.out.println();

        // Case2 - website "http://"
        String Website1 = "http://www.google.com";
        String pattern2 = "^http://.*$"; // matches website starting with "http://"
        boolean isMatch2 = Website1.matches(pattern2);
        System.out.println("Website address: " + Website1);
        System.out.println("Positive case: " + (Website1.matches(pattern2) ? "Match found!" : "Match not found."));
        System.out.println("Negative case: " + (!"www.example.com".matches(pattern2) ? "Match not found." : "Match found!"));
        System.out.println();

        // Case3 - 0-9 digit
        String Digit1 = "8905671234";
        String pattern3 = "\\d+"; // matches 1 or more digits
        boolean isMatch3 = Digit1.matches(pattern3);
        System.out.println("Digit1: "+ Digit1 );
        System.out.println("Positive case: " + (Digit1.matches(pattern3) ? "Match found!" : "Match not found."));
        System.out.println("Negative case: " + (!"12345a".matches(pattern3) ? "Match not found." : "Match found!"));
        System.out.println();

        // Case4 - email address
        String Email1 = "yuqingliu0502@outlook.com";
        String pattern4 = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; // matches email address format
        boolean isMatch4 = Color1.matches(pattern4);
        System.out.println("Email address: " + Email1);
        System.out.println("Positive case: " + (Email1.matches(pattern4) ? "Match found!" : "Match not found."));
        System.out.println("Negative case: " + (!"yuqingliu0502@outlook".matches(pattern4) ? "Match not found." : "Match found!"));
        System.out.println();

        // Case5 - time
        String Time1 = "09:01:25";
        String pattern5 = "^([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$"; // matches time in format HH:MM:SS
        boolean isMatch5 = Color1.matches(pattern5);
        System.out.println("Time: " + Time1);
        System.out.println("Positive case: " + (Time1.matches(pattern5) ? "Match found!" : "Match not found."));
        System.out.println("Negative case: " + (!"9:01:25".matches(pattern5) ? "Match not found." : "Match found!"));
        System.out.println();
    }
}
