package StringsBuilder;

public class convertToUpper {
   
    public static void main(String[] args) {

        String str = "hello world java programming";
        StringBuilder sb = new StringBuilder();

        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(ch);
                capitalizeNext = true;  // Next character should be capital
            } 
            else if (capitalizeNext) {
                sb.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } 
            else {
                sb.append(ch);
            }
        }

        System.out.println("Result: " + sb.toString());
    }
}
    

