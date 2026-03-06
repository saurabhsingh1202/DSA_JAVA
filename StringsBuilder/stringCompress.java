package StringsBuilder;

public class stringCompress {
    
    public static void main(String[] args) {

        String str = "abc";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            int count = 1;

            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count);
            }
        }

        String compressed = sb.toString();

        if(compressed.length() < str.length()) {
            System.out.println(compressed);
        } else {
            System.out.println(str);
        }
    }
}
    

