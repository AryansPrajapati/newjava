import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a string:");
        s = sc.nextLine();
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        if (s.equals(sbr.toString())) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is not Palindrome");
        }
        sc.close();
    }
}
