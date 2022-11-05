public class ConditionalActions {

    public String conditionalActions(int m) {
        if (m != 0) {

            if (m % 7 == 0 && m % 9 == 0) {

                return "Good Number";
            }
            if (m % 9 == 0) {

                return "Bad Number";
            }
            if (m % 11 == 0 && m % 7 != 0) {

                return "Poor Number";
            } else {


                return "-1";
            }
        }
        return "Zero is always multiple of every number";
    }
}