import java.util.*;
public class Basic {
    public static void main(String[] args){
        /* method 1 : to create a string using string word*/

        String name = "saurabh";

        System.out.println(name);

        /* method 2: using new keyword  */
        
        String s = new String("rana");
        System.out.println(s);


        /* making string with char array */

        char [] ch = {'j' , 'a' ,'v' ,'a'};
        String s1 = new String(ch);
        System.out.println(s1);

        /* Take String Input from User */

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name ");

        String name1=  sc.nextLine();

        System.out.println("hello " + name1);

        /* more  */

        String a = "Java";
        String b = "Programming";

        System.out.println(a + " " + b);


        /* understanding about length() */

        String s2= "saurabh";
        System.out.println("length of s2 is : "+ s2.length());

        /* space is also counted  */

        String s3 = "saurabh singh";
        System.out.println(s3.length());


        /* legth of empty string is 0
         */
         String p ="";
         int len = p.length();
         System.out.println(len);

         /* concatination : 
         method 1: using + operator  */

         String firstName = "Saurabh";
         String lastName ="singh";
         String fullName = firstName +" " + lastName;
         System.out.println(fullName);

         /*
         Concatenation with Numbers
          */

         String name2 ="rana";

         int dob = 1202;

         System.out.println(name2 + dob);
         /*
         order matters in concatination */

         int c=10;
         int d=20;
         String s4= "rana";
         System.out.println(c+d+s4);
         // output is 30rana because c and d are added first and then s4 is concatenated with the result

         System.out.println(c+s4+d);
            // output is 10rana20 because c is added to s4 first and then d is concatenated with the result
         System.out.println(s4+c+d);
            // output is rana1020 because s4 is concatenated with c first and then d is concatenated with the result


        /*Method 2: Using concat() Method
         */

        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2);
        System.out.println(result); // Output: HelloWorld
    }


}