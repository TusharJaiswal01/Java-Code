
//


public class string {
    public static void main(String[] args) {
        String str = "Hello World";


        // 1. length of string
        System.out.println(str.length());

        // 2. charAt
        System.out.println(str.charAt(0));

        // 3. substring
        System.out.println(str.substring(0, 5));

        // 4. indexOf
        System.out.println(str.indexOf("World"));

        // 5. replace
        System.out.println(str.replace("World", "Java"));

        // 6. toLowerCase
        System.out.println(str.toLowerCase());

        // 7. toUpperCase
        System.out.println(str.toUpperCase());
        System.out.println(str);
    }
}

