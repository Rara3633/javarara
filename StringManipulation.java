public class StringManipulation {
    
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = str.concat("World");
        String lowStr = newStr.toLowerCase();
        String subStr = newStr.substring(0, 5); //
        String replaceString = newStr.replace("world", "Java");

        System.out.println(newStr);
        System.out.println(lowStr);
        System.out.println(subStr);
        System.out.println(replaceString);
    }
}
