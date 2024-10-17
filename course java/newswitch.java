public class newswitch {
    public static void main(String args[]) {
        String day = "Monday";
        String result = "";

        /*
         * (//SWITCH WITH RETURN VALUE//)
         * switch (day) {
         * case "Saturday", "Sunday" -> result = "WAKE UP AT 10:00 AM";
         * 
         * case "Monday" -> result = "WAKE UP AT 7:00 AM";
         * 
         * default -> result = "WAKE UP AT 6:00 AM";
         * 
         * }
         * System.out.println(result);
         */

        /*
         * (//SWITCH AS EXPRESSION//)
         * result = switch (day) {
         * case "Saturday", "Sunday" -> "WAKE UP AT 10:00 AM";
         * 
         * case "Monday" -> "WAKE UP AT 7:00 AM";
         * 
         * default -> "WAKE UP AT 6:00 AM";
         * 
         * };
         * System.out.println(result);
         */

        // (SWITCH WITH COLON AND YIELD)
        result = switch (day) {
            case "Saturday", "Sunday":
                yield "WAKE UP AT 10:00 AM";

            case "Monday":
                yield "WAKE UP AT 7:00 AM";

            default:
                yield "WAKE UP AT 6:00 AM";

        };
        System.out.println(result);
    }
}
