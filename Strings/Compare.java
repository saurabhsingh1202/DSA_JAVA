public class Compare {
    public static void main(String [] args){
        /*
        Using == Operator
        == compares memory address (reference)
        It does NOT compare content
         */
        
         String s1 = "Java";
         String s2 = "Java";

        System.out.println(s1 == s2);

        // true Because both refer to same object in String Constant Pool

        String s3 = new String("java");
        String s4 = new String("java");
        System.out.println(s3 == s4);
        // false Because new creates separate objects in heap.

        /*
        2️⃣ Using equals() Method (Most Important)

         equals() compares actual content
            */

         String s5 = new String("Java");
        String s6 = new String("Java");

        System.out.println(s5.equals(s6));


        /*
        3️⃣ Using equalsIgnoreCase()

        Ignores uppercase/lowercase difference.
       */
       String s7 = new String("JAVA");
       String s8 = new String("java");
       System.out.println(s7.equalsIgnoreCase(s8));
    


       /*
       4️⃣ Using compareTo() Method (Very Important)

          Used for lexicographical comparison (dictionary order)
         */
      
          String s10 = "apple";
         String s11 = "banana";

        int result = s10.compareTo(s11);

        if(result == 0) {
            System.out.println("Strings are equal");
        }
        else if(result > 0) {
            System.out.println("s10 is greater than s11");
        }
        else {
            System.out.println("s10 is smaller than s11");
        }

    }
    
}
