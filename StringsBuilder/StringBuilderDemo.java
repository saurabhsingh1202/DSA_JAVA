public class StringBuilderDemo {

    public static void main(String[] args) {

        // 1️⃣ Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Initial String: " + sb);

        // 2️⃣ append() - Add text at end
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // 3️⃣ insert() - Insert at specific index
        sb.insert(5, " Java");
        System.out.println("After insert(): " + sb);

        // 4️⃣ replace() - Replace part of string
        sb.replace(6, 10, "C++");
        System.out.println("After replace(): " + sb);

        // 5️⃣ delete() - Delete part of string
        sb.delete(6, 10);
        System.out.println("After delete(): " + sb);

        // 6️⃣ deleteCharAt() - Delete single character
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(): " + sb);

        // 7️⃣ reverse() - Reverse the string
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // 8️⃣ length()
        System.out.println("Length: " + sb.length());

        // 9️⃣ charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 🔟 capacity()
        System.out.println("Capacity: " + sb.capacity());
    }
}