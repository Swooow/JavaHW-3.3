public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int month = 12;
        double percent = 0.0999;
        double annuityPayment = service.calculate(credit,month,percent);
        System.out.println(annuityPayment);

    }
}
