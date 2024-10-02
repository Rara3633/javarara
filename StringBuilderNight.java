public class StringBuilderNight {
    
        public static void main(String[] args) {
            String str = "  Hello, World!  ";
    
            // Length of the string
            System.out.println("Length: " + str.length());
    
            // Substring
            System.out.println("Substring (from index 7): " + str.substring(7));
    
            // Character at index
            System.out.println("Character at index 1: " + str.charAt(1));
    
            // Index of a character
            System.out.println("Index of 'o': " + str.indexOf('o'));
    
            // Replace
            System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
    
            // Trim
            System.out.println("Trimmed string: '" + str.trim() + "'");
    
            // Upper and lower case
            System.out.println("Upper case: " + str.toUpperCase());
            System.out.println("Lower case: " + str.toLowerCase());
    
            // Split
            String[] parts = str.split(", ");
            System.out.println("Split: ");
            for (String part : parts) {
                System.out.println(part);
            }
    
            // Using StringBuilder
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(", World!");
            System.out.println("StringBuilder result: " + sb.toString());
        }
    }
    

