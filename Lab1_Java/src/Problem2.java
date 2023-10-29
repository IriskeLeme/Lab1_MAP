public class Problem2{
    public static int maxZahl(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minZahl(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxSumme(int[] array){
        int sum = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
        }
        return sum - min;
    }

    public static int minSumme(int[] array){
        int sum = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] < max){
                max = array[i];
            }
        }
        return sum - max;
    }
}
