public class Problem3 {
 public int[] summe(int[] num1, int[] num2){
     int[] result = new int[num1.length + 1];
     int carry = 0;

     for (int i = num1.length - 1; i >= 0; i--){
         int sum = num1[i] + num2[i] + carry;
         result[i + 1] = sum % 10;
         carry = sum / 10;
     }
     if (carry > 0){
         for (int i = result.length - 1; i > 0; i--) {
             result[i] = result[i - 1];
         }
         result[0] = carry;
     }

     return result;
 }

 public int[] differenz(int[] num1, int[] num2){
     int[] result = new int[num1.length];
     int borrow = 0;

     for (int i = num1.length - 1; i >= 0; i--){
         int diff = num1[i] - num2[i] - borrow;
         if (diff < 0){
             diff += 10;
             borrow = 1;
         } else {
             borrow = 0;
         }
         result[i] = diff;

     }
     return result;
 }

 public int[] multiplikation(int[] num, int digit){
     int[] result = new int[num.length];
     int carry = 0;

     for(int i = num.length - 1; i >= 0; i--){
         int produkt = num[i] * digit + carry;
         result[i] = produkt % 10;
         carry = produkt / 10;
     }
     if (carry > 0) {
         for (int i = result.length - 1; i > 0; i--) {
             result[i] = result[i - 1];
         }
         result[0] = carry;
     }
     return result;
 }
 public int[] division(int[] num, int digit){
     int[] result = new int[num.length];
     int rest = 0;

     for(int i = 0; i < num.length; i++){
         int dividend = rest * 10 + num[i];
         result[i] = dividend / digit;
         rest = dividend % digit;
     }
     return result;
 }
}

