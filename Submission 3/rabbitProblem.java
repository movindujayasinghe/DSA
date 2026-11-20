public class rabbitProblem {
    public static void main(String[] args) {
        int months = 12;
        int pairs = 1;

        System.out.println("Month 1: " + pairs + " pair(s)");

        for (int month = 2; month <= months; month++) {
            pairs = pairs + (month > 2 ? pairs : 0);
            System.out.println("Month " + month + ": " + pairs + " pair(s)");
        }
    }
}