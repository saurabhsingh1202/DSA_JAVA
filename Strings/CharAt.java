import java.util.Scanner;

public class CharAt{
    public static void main(String[] args) {
        String s = "saurabh";
        System.out.println(s.charAt(0)); // s
        System.out.println(s.charAt(1)); // a
        System.out.println(s.charAt(2)); // u
        System.out.println(s.charAt(3)); // r
        System.out.println(s.charAt(4)); // a
        System.out.println(s.charAt(5)); // b
        System.out.println(s.charAt(6)); // h

        /* if we try to access index which is out of bound then it will throw StringIndexOutOfBoundsException */

        // System.out.println(s.charAt(7)); // StringIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        
        System.out.println("First character: " + word.charAt(0));

    }
}