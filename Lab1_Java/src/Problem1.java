public class Problem1 {
    public static int[] nichtausreichend(int[] noten) {
        int[] kleineNoten = new int[noten.length];
        int count = 0;
        for (int i : noten) {
            if (i < 40) {
                kleineNoten[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = kleineNoten[i];
        }
        return result;
    }

    public static int durchschnitt(int[] noten) {
        int count = 0;
        int sum = 0;
        for (int i : noten) {
            sum = sum + i;
            count++;
        }
        int durchschnitt = sum / count;
        return durchschnitt;
    }

    private static int abrunden(int note) {
        if (note < 38 || note % 5 < 3) {
            return note;
        } else if(note >= 38 && note % 5 >=3){
            return note + (5 - (note % 5));
        }
        return 0;
    }
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundete = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            abgerundete[i] = abrunden(noten[i]);
        }
        return abgerundete;
    }

    public static int maximalabgerundet(int[] abgerundeteNoten) {
        int maxNote = 0;
        for (int i : abgerundeteNoten) {
            if (i > maxNote) {
                maxNote = i;
            }
        }
        return maxNote;
    }
}
