class FibbonacciSeries {
    public static void main(String[] args) {
        int a = 3, b = 2, sum = 0;
        System.out.print("Fibbonacci Series:" +a + " " + b);
        for (int i = 2; i < 10; i++) {
            sum = a + b;

            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }

}
