/**
 * Computes the population growth of green crud over time.
 */
public class GreenCrud {
    /**
     * Creates a {@code GreenCrud} instance.
     */
    public GreenCrud() {
    }

    /**
     * Calculates the green crud population after a given number of days.
     *
     * @param initialSize the starting population size
     * @param days the number of elapsed days
     * @return the population after the specified number of days
     */
    public int calPopulation(int initialSize, int days) {
        // Calculate how many 5-day cycles have passed
        int cycles = days / 5;

        // The crud population corresponds to the Fibonacci number at (cycles + 1)
        int multiplier = getFibonacci(cycles + 1);

        return initialSize * multiplier;
    }

    /**
     * Returns the n-th Fibonacci number used as the growth multiplier.
     *
     * @param n the Fibonacci sequence index, starting at 1
     * @return the n-th Fibonacci number
     */
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
