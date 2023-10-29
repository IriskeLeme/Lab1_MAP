public class Problem2_Tests {

    public static void testMaxZahl() {
        int[] array = {4, 8, 1, 9, 2, 5};
        int expectedOutput = 9;
        int result = Problem2.maxZahl(array);
        if (result != expectedOutput) {
            System.out.println("Max Zahl Test Failed: Expected " + expectedOutput + ", got " + result);
        } else {
            System.out.println("Max Zahl Test Passed");
        }
    }

    public static void testMinZahl() {
        int[] array = {4, 8, 1, 9, 2, 5};
        int expectedOutput = 1;
        int result = Problem2.minZahl(array);
        if (result != expectedOutput) {
            System.out.println("Min Zahl Test Failed: Expected " + expectedOutput + ", got " + result);
        } else {
            System.out.println("Min Zahl Test Passed");
        }
    }

    public static void testMaxSumme() {
        int[] array = {4, 8, 1, 9, 2, 5};
        int expectedOutput = 28;
        int result = Problem2.maxSumme(array);
        if (result != expectedOutput) {
            System.out.println("Max Summe Test Failed: Expected " + expectedOutput + ", got " + result);
        } else {
            System.out.println("Max Summe Test Passed");
        }
    }

    public static void testMinSumme() {
        int[] array = {4, 8, 1, 9, 2, 5};
        int expectedOutput = 28;
        int result = Problem2.minSumme(array);
        if (result != expectedOutput) {
            System.out.println("Min Summe Test Failed: Expected " + expectedOutput + ", got " + result);
        } else {
            System.out.println("Min Summe Test Passed");
        }
    }
}

