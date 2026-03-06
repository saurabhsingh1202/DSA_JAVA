
public class Pelidrome{
    public static void main(String [] args){
        /*
        method 1 : revse a string and check */
        String name ="racecar";
        String reverseString ="";

        for(int i =name.length()-1; i>=0; i--){
            reverseString+= name.charAt(i);
        }

        if (name.equals(reverseString)) {
            System.err.println("pelidrome");
            
        }
        else{
            System.out.println("not a pelidrome");
        }

        /*
        method 2: comapre at both side  */

        String s1 = "madam";
        boolean ispelidrome= true;

        for(int i =0; i<=s1.length()/2; i++){
            if (s1.charAt(i) != s1.charAt(s1.length()-1-i)) {
                ispelidrome = false;
                break;
                
            }

       }
       if (ispelidrome) {
        System.out.println("pelidrome");
       }
       else{
        System.out.println("no pelidrome");
       }
    }
}