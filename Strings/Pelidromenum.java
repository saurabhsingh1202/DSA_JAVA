public class Pelidromenum {
   
    public static void main(String[] args) {

        int num = 121;
        int original = num;
        int reverse = 0;

        while(num > 0) {
            int digit = num % 10;      // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;           // remove last digit
        }

        if(original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
    

