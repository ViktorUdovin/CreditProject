public class CreditPaymentService {

    public long calculate(int term, int credit, double percent) {
        double monthpercent = percent / 12 / 100;
        double koefficient = (monthpercent * Math.pow(1 + monthpercent, term)) / (Math.pow(1 + monthpercent, term) - 1);
        double monthpayment = koefficient * credit;

        return (int) monthpayment;
    }
}
