class OddOccurringNumbers
{
    static void printOdds(int arr[], int n)
    {
        // Find XOR of
        // all numbers
        int res = 0;
        for (int i = 0; i < n; i++)
            res = res ^ arr[i];

        // Find a set bit in the
        // XOR (We find rightmost
        // set bit here)
        int set_bit = res & (~(res - 1));

        // Traverse through all
        // numbers and divide them
        // in two groups (i) Having
        // set bit set at same position
        // as the only set bit in
        // set_bit (ii) Having 0 bit at
        // same position as the only
        // set bit in set_bit
        int x = 0, y = 0;
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] & set_bit) != 0)
                x = x ^ arr[i];
            else
                y = y ^ arr[i];
        }

        // XOR of two different
        // sets are our required
        // numbers.
        System.out.println( x + " " + y);
    }

    // Driver code
    public static void main(String [] args)
    {
        int arr[] = { 2, 3, 3, 4, 4, 5 };
        int n = arr.length;
        printOdds(arr, n);
    }
}
