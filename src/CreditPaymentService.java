public class CreditPaymentService {
    public int calculate(int credit, int month, double percent){
        //s = k * (m × (1 + m)ⁿ) / ((1 + m)ⁿ — 1)
        // где S - аннуитетный платеж, К - полная сумма кредита,
        // m — процентная ставка в месяц, равная годовой ставке, поделённой на 12, а n — количество платежей.
        // К примеру, вы взяли заём в 100 000 рублей на 2 года под 20% годовых.
        // В этом случае m будет равно: 20%: 12 = 1,66% или 0,0166, а n = 24.

        // Оператор double у = Math.pow(x, a);
        // присваивает переменной у значение переменной х, возведенное в степень а.

        double m = percent/month;
        double d = Math.pow((1 + m),month);
        double annuity = ((m * d)/(d-1));
        double annuityPayment = credit * annuity;

        return (int) annuityPayment;
    }
}
