public class Main {
    public static void main(String[] args) {
        // Tests for Problem1
        Problem1_Tests.testnichtausreichend();
        Problem1_Tests.testdurchschnitt();
        Problem1_Tests.testabgerundet();
        Problem1_Tests.testmaximalabgerundet();

        // Tests for Problem2
        Problem2_Tests.testMaxZahl();
        Problem2_Tests.testMinZahl();
        Problem2_Tests.testMaxSumme();
        Problem2_Tests.testMinSumme();

        // Tests for Problem3
        Problem3_Tests.testSumme();
        Problem3_Tests.testDifferenz();
        Problem3_Tests.testMultiplikation();
        Problem3_Tests.testDivision();

        // Tests for Problem4
        Problem4_Tests.testBilligsteTastatur();
        Problem4_Tests.testTeuersteItem();
        Problem4_Tests.testTeuersteUSB();
        Problem4_Tests.testFindTotalAmount();
    }
}