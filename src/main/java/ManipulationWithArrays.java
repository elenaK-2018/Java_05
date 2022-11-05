public class ManipulationWithArrays {


    /**
     * Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

     public  int[] multiplyArrayByNumber(int[] array, int number) {

         if(array == null){

             return new int[0];
         }

         int[] arrayOfProducts = new int[array.length];

         if (number == 0) {

             return arrayOfProducts;
         }
         if (array.length == 0 ) {
             return new int[0];
         }

         for (int i = 0; i < array.length; i ++) {
             int product = array[i] * number;
             if (product / number == array[i]) {
                 arrayOfProducts[i] = product;
             } else {

                 return new int[0];
             }
         }

         return arrayOfProducts;
     }

}
