public class Problem4{
    public static int billigsteTastatur(int[] tastaturen) {
        int min = Integer.MAX_VALUE;
        for (int price : tastaturen) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    public static int teuersteItem(int[] tastaturen, int[] usbDrives) {
        int max = -1;
        for (int price : tastaturen) {
            if (price > max) {
                max = price;
            }
        }
        for (int price : usbDrives) {
            if (price > max) {
                max= price;
            }
        }
        return max;
    }

    public static int teuersteUSB(int[] usbDrives, int budget) {
        int max = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > max) {
                max = price;
            }
        }
        return max;
    }

    public static int findTotalAmount(int budget, int[] tastaturen, int[] usbDrives) {
        int billigsteTastatur = Integer.MAX_VALUE;
        int billigsterUSBDrive = Integer.MAX_VALUE;

        for (int price : tastaturen) {
            if (price < billigsteTastatur) {
                billigsteTastatur = price;
            }
        }

        for (int price : usbDrives) {
            if (price < billigsterUSBDrive) {
                billigsterUSBDrive = price;
            }
        }

        int kosten = billigsteTastatur + billigsterUSBDrive;
        if (kosten > budget) {
            return -1;
        }

        return kosten;
    }
}