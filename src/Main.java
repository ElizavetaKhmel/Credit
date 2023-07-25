public class Main {
    public static void main(String[] args) {
        Calculator сalculator = new Calculator();
        int ep = сalculator.calculate(1000000, 9.99, 1);
        System.out.println(ep);
    }
}