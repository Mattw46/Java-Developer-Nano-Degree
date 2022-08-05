public class ReverseString {

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reversed = sb.reverse();
        return reversed.toString();
    }
}
