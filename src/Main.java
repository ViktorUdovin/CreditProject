public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditoneyear = service.calculate(12, 1000000);
        System.out.println(creditoneyear);

        double credittwoyears = service.calculate(24, 1000000);
        System.out.println(credittwoyears);

        double creditthreeyears = service.calculate(36, 1000000);
        System.out.println(creditthreeyears);
    }
}
