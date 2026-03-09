public class GreenCrud {

    public int calPopulation(int initialSize, int days) {
        // Calculate how many 5-day cycles have passed
        int cycles = days / 5;

        // The crud population corresponds to the Fibonacci number at (cycles + 1)
        int multiplier = getFibonacci(cycles + 1);

        return initialSize * multiplier;
    }

    // Helper method to calculate the n-th Fibonacci number
    private int getFibonacci(int n) {
        if (n <= 2) {
            return 1; // F1 = 1, F2 = 1
        }

        int prev1 = 1;
        int prev2 = 1;
        int current = 1;

        // Calculate iteratively to save memory
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}