package NuevoRegistro;

public class calcDouble {
    public double calcularMinima(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double calcularMitjanaa(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma / array.length;
    }
    public double calcularMaxima(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
