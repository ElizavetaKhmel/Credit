public class Calculator {
    public int calculate(int creditAmount, double precentRate, int year) {
        double month = 12 * year;
        double monthPrecentDate = precentRate / 100 / 12;
        double monthPayment = creditAmount * (monthPrecentDate + (monthPrecentDate / (Math.pow((1 + monthPrecentDate), month) - 1)));
        return (int) monthPayment;
    }
}
