public class Problem4_Tests {

    public static void testBilligsteTastatur(){
        int[] tastaturen = {40, 60, 30, 80, 50};
        int expectedOutput = 30;
        int result = Problem4.billigsteTastatur(tastaturen);
        if(result != expectedOutput){
            System.out.println("Billigste Tastatur Test Failed");
        } else {
            System.out.println("Billigste Tastatur Test Passed");
        }
    }
    public static void testTeuersteItem(){
        int[] tastaturen = {40, 60, 30, 80, 50};
        int[] usbDrives = {20, 50, 70, 45};
        int expectedOutput = 80;
        int result = Problem4.teuersteItem(tastaturen, usbDrives);
        if(result != expectedOutput){
            System.out.println("Teuerste Item Test Failed");
        } else {
            System.out.println("Teuerste Item Test Passed");
        }
    }
    public static void testTeuersteUSB(){
        int[] usbDrives = {20, 50, 70, 45};
        int budget = 60;
        int expectedOutput = 50;
        int result = Problem4.teuersteUSB(usbDrives, budget);
        if(result != expectedOutput){
            System.out.println("Teuerste USB Test Failed");
        } else {
            System.out.println("Teuerste USB Test Passed");
        }
    }
    public static void testFindTotalAmount(){
        int[] tastaturen = {40, 60, 30, 80, 50};
        int[] usbDrives = {20, 50, 70, 45};
        int budget = 100;
        int expectedOutput = 50;
        int result = Problem4.findTotalAmount(budget, tastaturen, usbDrives);
        if(result != expectedOutput){
            System.out.println("Find Total Amount Test Failed");
        } else {
            System.out.println("Find Total Amount Test Passed");
        }
    }
}
