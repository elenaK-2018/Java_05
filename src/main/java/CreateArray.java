public class CreateArray {


    /**
     * метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */


    public int[] createIntArray(int a, int b, int c, int d, int e) {

        return new int[] {a, b, c, d, e};
    }


    /**
     * Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив
     * из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */


    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        return new double[] {a, b, c, d, e};
    }


    /**
     * Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     * Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */


    public String[] createStringArray(String a, String b, String c, String d, String e) {

        String[] array = {a, b, c, d, e};

        return array;
    }


    /**
     * Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов
     * и возвращает массив из этих слов.
     * Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */


    public String[] createArrayFromText(String sentence) {

        return sentence.split(" ");
    }

}
