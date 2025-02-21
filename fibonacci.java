public class fibonacci {
    public static void main(String[] args) {
        int b = 0, c = 1;

        System.out.println("\n\nSequncia de Fibonacci:");

        for (int i = 0; i < 10; i++) {
            System.out.println(b + " ");
            int proxNum = b + c;
            b = c;
            c = proxNum;
        }
    }
}