import org.junit.Assert;

public class PermutationTest {

    @org.junit.Test
    public void testPermutation() {
        // We will capture the output of printPermutn() to verify it
        // Use a ByteArrayOutputStream to capture the System.out output

        // Create a new ByteArrayOutputStream to capture output
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        // Test array
        int[] arr = {1, 2, 3};

        // Call the method that prints the permutations
        Permutation.printPermutn(arr, 0);

        // Now, capture the printed output
        String output = outputStream.toString();

        // Expected output for the array [1, 2, 3]
        String expectedOutput =
                "1 2 3 \n" +
                        "1 3 2 \n" +
                        "2 1 3 \n" +
                        "2 3 1 \n" +
                        "3 2 1 \n" +
                        "3 1 2 \n";

        // Compare the output
        Assert.assertEquals(expectedOutput, output);
    }
}
