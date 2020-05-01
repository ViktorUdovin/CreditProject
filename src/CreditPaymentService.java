public class CreditPaymentService {

    public long calculate(int term, int credit) {

        int oneyear = 12;
        int twoyears = 24;
        int threeyears = 36;
        double oneyearkoeff = 0.087911;
        double twoyearskoeff = 0.046140;
        double threeyearskoeff = 0.032262;
        double mainkoff = 0;


        if (term == oneyear) {
            mainkoff = oneyearkoeff;
        }
        if (term == twoyears) {
            mainkoff = twoyearskoeff;
        }
        if (term == threeyears) {
            mainkoff = threeyearskoeff;
        }
        double monthpayment = credit * mainkoff;

        return (int) monthpayment;


    }
}
