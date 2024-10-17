public class Exception {
    public static void main(String args[]) {
        int bal = 10000;
        int wdl = 9000;
        try {
            if (wdl > bal) {
                throw new ArithmeticException("You don't have enough balance");
            }
            bal = bal - wdl;
            System.out.println("Amount withdrawn");
        } catch (ArithmeticException e) {
            System.out.println("Our Catch: " + e.getMessage());

        }
        System.out.println("Our program is going to continue");

    }
}