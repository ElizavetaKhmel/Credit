public class Calculator {
    public int calculate(int sk, double ps, int year) {
        double kp = 12 * year;
        double mps = ps / 100 / 12;
        double ep = sk * (mps + (mps / (Math.pow((1 + mps), kp) - 1)));
        return (int) ep;
    }
}
