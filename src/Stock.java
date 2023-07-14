class Stock {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 2, 4, 10  , 5, 3};

        int maximum = numbers[0];
        int minimum = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
                maxIndex = i;
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);

        if (minIndex < maxIndex) {
            int difference = maximum - minimum;
            System.out.println("Gain: " + difference);
        } else {
            System.out.println("Loss");
        }
    }
}
