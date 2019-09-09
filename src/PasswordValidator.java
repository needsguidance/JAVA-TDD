import java.util.regex.Pattern;

public class PasswordValidator {
    
    public static boolean ContainsUpperCase(String s) {
        String s2 = s.toLowerCase();
        return !s.equals(s2);
    }

    public static boolean ContainsNumber(String s) {
        return s.matches(".*\\d.*");
    }

    public static boolean ContainsSpecialCharacter(String s) {
        Pattern regex = Pattern.compile("!@#$%^&*()[]{}?<>;:");
        return regex.matcher(s).find();
    }

    public static boolean IsValidPassword(String password) {
        return ContainsUpperCase(password) && ContainsNumber(password);
    }

    public static void main(String[] args) {
        String password = "Hijodetumadre1-";
        System.out.println(IsValidPassword(password));
    }
}