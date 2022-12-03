package ejercicios_capitulo6;

/**
 *
 * @author JOSTHEN ARIAN GABRIEL CHAUCA
 */
/**01. ORDENACION POR INTERCAMBIO: El algoritmo de ordenación tal vez más sencillo sea el 
 * denominado de intercambio, que ordena
 *los elementos de una lista en orden ascendente. 
 */
public class Ejercicios_01 {

    public static void main(String[] args) {
    }
    
    public static void ordSeleccion (double a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n-1; i++){
            // comienzo de la exploración en índice i
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i+1; j < n; j++){
                if (a[j] < a[indiceMenor]){
                    indiceMenor = j;
                    // sitúa el elemento mas pequeño en a[i]
                }
                if (i != indiceMenor){
                    intercambiar(a, i, indiceMenor);
                }
            }
        }
    }

    private static void intercambiar(double[] a, int i, int indiceMenor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
