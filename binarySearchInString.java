public class Main {
    public static void main(String[] args) {

        String s = "Saurabh";
        char t = 'S';
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("404 Not found");
        }
    }
}