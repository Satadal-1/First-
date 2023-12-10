public class Pattern {
    public static void main(String[] args) {
        int rows = 1; // Number of rows in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print asterisks in each row
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
