import java.util.Arrays;

public class OddIndices {


    public int[] oddIndices(int[] array) {
        if (array != null && array.length > 0) {
            int j = 0;
            int[] mass = new int[array.length / 2];           //создаём массив в 2 раза меньше
            for (int i = 1; i < array.length; i = i + 2) {    //если нужны четные , то длина = int[] = new int
                mass[j] = array[i];                           //[array.length  и начинать с int i = 0/
                j++;
            }

            return mass;
        }

        return new int[0];

    }
}
