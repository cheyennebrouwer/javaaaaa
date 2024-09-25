package section1_intro.part1_language_basics;

public class LanguageBasics {

    /**
     * A method that determines whether x is a multiple of y.
     * The modulo operator '%' is excellent for this job.
     * @param x
     * @param y
     * @return multiple
     */
    public boolean isMultiple(int x, int y) {
        return x % y == 0;
    }

    /**
     * This method should return the travelled distance (in meters) for the given speed (km/h) and
     * elapsed time (minutes).
     *
     * @param speedInKmPerHour
     * @param elapsedTimeInMinutes
     * @return
     * speed = distance/time
     * speed to minutes instead of hour
     */
    public double getDistanceInMeters(double speedInKmPerHour, double elapsedTimeInMinutes) {
        double time = elapsedTimeInMinutes / 60; // Convert minutes to hours
        double distance = speedInKmPerHour * time * 1000; // Convert to meters
        return distance;
    }

    /**
     * This method should return the cumulative sum of 1 to n.
     * So, when 4 is passed, it should return 1 + 2 + 3 + 4 = 10
     * The for-loop is already given but you should initialize i to a correct value
     * and add the algorithm logic
     * @param n
     * @return cumulative sum
     */
    public int getCumulativeSum(int n) {
        int sum = 0; // Start accumulating from 0
        for (int i = 1; i <= n; i++) { // Start from 1 up to n
            sum += i;
        }
        return sum;
    }

    /**
     * This method should return "number" to the power of "powerUp", where the absolute value (the - sign is removed if
     * present) is taken of "powerUp". Again, the Math class may come in handy.
     * @param number the number to power up
     * @param powerUp the power up value
     * @return number^absolute(powerUp)
     */
    public double getTheAbsolutePower(int number, int powerUp) {
        return Math.pow(number, Math.abs(powerUp)); // Use Math.pow() and Math.abs()
    }

    /**
     * In the following methods, several variables are declared and initialized.
     * Only one of the variables is named according to Java naming style rules.
     * Return the one that is correctly named (the value of the variable is irrelevant!).
     * @return correctVariable
     */
    public String returnCorrectlyNamedVariable_1() {
        String nameOfKing = "Louis XIV, le Roi Soleil"; // Correct naming according to camelCase
        return nameOfKing;
    }

    public String returnCorrectlyNamedVariable_2() {
        String scoreBoard = "D"; // Correct naming
        return scoreBoard;
    }

    public String returnCorrectlyNamedVariable_3() {
        String dnaTranslator = "B"; // Correct naming
        return dnaTranslator;
    }



}
