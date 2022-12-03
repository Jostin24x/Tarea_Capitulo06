package ejercicios_capitulo6;

/**
 *
 * @author ACER
 * 2. Ordenación por selección: Considérese el algoritmo para ordenar un array a[] de enteros en orden ascendente, es decir,
si el array a[] tiene n elementos, se trata de ordenar los valores del array de modo que a[0]
sea el valor más pequeño, el valor almacenado en a[1] sea el siguiente más pequeño, y así
hasta a[n-1] que ha de contener el elemento de mayor valor.
 */
public class Ejercicio_02 {

    public static void ordSeleccion (double a[]) {
         int indiceMenor, i, j, n;
	 n = a.length;	
	 for (i = 0; i < n-1; i++)
	 {
	 	 // comienzo de la exploración en índice i
	 	 indiceMenor = i;
	 	 // j explora la sublista a[i+1]..a[n-1]
	 	 for (j = i+1; j < n; j++)
	 	 	 if (a[j] < a[indiceMenor])
	 	 	 	 indiceMenor = j;
                  // sitúa el elemento mas pequeño en a[i]
	 	 if (i != indiceMenor)
	 	 	 intercambiar(a, i, indiceMenor);
	 }
    }

    private static void intercambiar(double[] a, int i, int indiceMenor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
