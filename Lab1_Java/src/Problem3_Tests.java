import java.util.Arrays;
public class Problem3_Tests {

    public static void testSumme(){
        Problem3 problem3 = new Problem3();
        int[] num1 = {4, 5, 6};
        int[] num2 = {2, 3, 4};
        int[] expectedOutput = {0, 6, 9, 0};
        int[] result = problem3.summe(num1, num2);
        if (Arrays.equals(result, expectedOutput)) {
            System.out.println("Summe Test Passed");
        } else {
            System.out.println("Summe Test Failed");
        }
    }
    public static void testDifferenz(){
        Problem3 problem3 = new Problem3();
        int[] num1 = {4, 5, 6};
        int[] num2 = {2, 3, 4};
        int[] expectedOutput = {2, 2, 2};
        int[] result = problem3.differenz(num1, num2);
        if (Arrays.equals(result, expectedOutput)) {
            System.out.println("Differenz Test Passed");
        } else {
            System.out.println("Differenz Test Failed");
        }
    }
    public static void testMultiplikation(){
        Problem3 problem3 = new Problem3();
        int[] num = {1, 2, 3};
        int digit = 2;
        int[] expectedOutput = {2, 4, 6};
        int[] result = problem3.multiplikation(num, digit);
        if (Arrays.equals(result, expectedOutput)) {
            System.out.println("Multiplikation Test Passed");
        } else {
            System.out.println("Multiplikation Test Failed");
        }
    }
    public static void testDivision(){
        Problem3 problem3 = new Problem3();
        int[] num = {8, 6, 2};
        int digit = 2;
        int[] expectedOutput = {4, 3, 1};
        int[] result = problem3.division(num, digit);
        if (Arrays.equals(result, expectedOutput)) {
            System.out.println("Division Test Passed");
        } else {
            System.out.println("Division Test Failed");
        }
    }
}
