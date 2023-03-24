public class RegexDemo {
    public static void main(String[] args) {
        // Case1 - color
        String Color1  = "#1a2b3c";
        String pattern1 = "^#[0-9a-fA-F]{6}$"; // matches color in a valid hex format (#RRGGBB)
        boolean isMatch1 = Color1.matches(pattern1);
        System.out.println("Color1: " + Color1);
        System.out.println("Positive: " + (Color1.matches(pattern1) ? "It is valid" : "It is invalid"));
        System.out.println("Negative: " + (!"#1a2b3".matches(pattern1) ? "It is invalid" : "It is valid"));
        System.out.println();

        // Case2 - website "http://"
        String Website1 = "http://www.google.com";
        String pattern2 = "^http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?$"; // matches website starting with URLs
        boolean isMatch2 = Website1.matches(pattern2);
        System.out.println("Website1: " + Website1);
        System.out.println("Positive: " + (Website1.matches(pattern2) ? "It is valid" : "It is invalid"));
        System.out.println("Negative: " + (!"www.google.com".matches(pattern2) ? "It is invalid" : "It is valid"));
        System.out.println();

        // Case3 - 0-9 digit
        String Digit1 = "8905671234";
        String pattern3 = "\\d+"; // matches 1 or more digits
        boolean isMatch3 = Digit1.matches(pattern3);
        System.out.println("Digit1: "+ Digit1 );
        System.out.println("Positive: " + (Digit1.matches(pattern3) ? "It is valid" : "It is invalid"));
        System.out.println("Negative: " + (!"89056a".matches(pattern3) ? "It is invalid" : "It is valid"));
        System.out.println();

        // Case4 - email address
        String Email1 = "yuqingliu0502@outlook.com";
        String pattern4 = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; // matches email address format
        boolean isMatch4 = Email1.matches(pattern4);
        System.out.println("Email1: " + Email1);
        System.out.println("Positive: " + (Email1.matches(pattern4) ? "It is valid" : "It is invalid"));
        System.out.println("Negative: " + (!"yuqingliu0502.outlook.com".matches(pattern4) ? "It is invalid" : "It is valid"));
        System.out.println();

        // Case5 - time
        String Time1 = "09:01:25";
        String pattern5 = "^([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$"; // matches time in format HH:MM:SS
        boolean isMatch5 = Time1.matches(pattern5);
        System.out.println("Time1: " + Time1);
        System.out.println("Positive: " + (Time1.matches(pattern5) ? "It is valid" : "It is invalid"));
        System.out.println("Negative: " + (!"24:01:00".matches(pattern5) ? "It is invalid" : "It is valid"));
        System.out.println();
    }
}
