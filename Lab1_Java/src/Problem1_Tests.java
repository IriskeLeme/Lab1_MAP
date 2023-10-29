public class Problem1_Tests {

    public static void testnichtausreichend(){
        int[] noten = {25, 35, 45, 55, 60};
        int[] expectedOutput = {25, 35};
        int[] result = Problem1.nichtausreichend(noten);
        if(result.length != expectedOutput.length){
            System.out.println("Nicht Ausreichend Test Failed: Different Length");
            return;
        }
        for (int i = 0; i < result.length; i++){
            if (result[i] != expectedOutput[i]){
                System.out.println("Nicht Ausreichend Test Failed: Different Values");
                return;
            }
        }
        System.out.println("Nicht Ausreichend Test Passed");
    }
    public static void testdurchschnitt(){
        int[] noten = {25, 35, 45, 55, 60};
        int expectedOutput = 44;
        int result = Problem1.durchschnitt(noten);
        if(result != expectedOutput){
            System.out.println("Durchschnitt Test failed: Different Values");
        } else {
            System.out.println("Durchschnitt Test Passed");
        }

    }
    public static void testabgerundet(){
        int[] noten = {25, 35, 45, 48, 56, 69};
        int[] expectedOutput = {25, 35, 45, 50, 56, 70};
        int[] result = Problem1.abgerundeteNoten(noten);
        if (result.length != expectedOutput.length){
            System.out.println("Abgerundet Test Failed: Different length");
            return;
        }
        for (int i = 0; i < result.length; i++){
            if (result[i] != expectedOutput[i]){
                System.out.println("Abgerundet Test Failed: Different Values");
                return;
            }
        }
        System.out.println("Abgerundet Test Passed");
    }
    public static void testmaximalabgerundet(){
        int[] noten = {50, 70, 85};
        int expectedOutput = 85;
        int result = Problem1.maximalabgerundet(noten);
        if (result != expectedOutput){
            System.out.println("Maximal Abgerundet Test Failed: Different Values");
        } else{
            System.out.println("Maximal Abgerundet Test Passed");
        }

    }
}
