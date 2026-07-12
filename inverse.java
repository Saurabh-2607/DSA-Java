public class Main {
    public static void main(String[] args) {
        String n = "1254896";
        String n2 = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            n2 += n.charAt(i);
        }

        System.out.println(n2);
    }
}