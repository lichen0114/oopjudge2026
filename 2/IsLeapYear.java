/**
 * Determines whether a given year is a leap year.
 */
public class IsLeapYear {
    /**
     * Creates an {@code IsLeapYear} instance.
     */
    public IsLeapYear() {
    }

    /**
     * Determines whether a given year is a leap year.
     *
     * @param year an integer representing the year ({@code 1 <= year <= 10000})
     * @return true if the year is a leap year, false otherwise
     */
    public boolean determine(int year) {
        // A year is a leap year if it is divisible by 400,
        // OR if it is divisible by 4 but NOT by 100.
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
