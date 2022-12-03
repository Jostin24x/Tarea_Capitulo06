
package ejercicios_capitulo6;

/**
 *
 * @author ACER
 * 5. Ordenación rapida:El algoritmo conocido como quicksort (ordenación rápida) recibe su nombre de su autor, Tony
Hoare. La idea del algoritmo es simple, se basa en la división en particiones de la lista a ordenar,
por ello se puede considerar que aplica la técnica "divide y vencerás"
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void quicksort(double a[]) {
        quicksort(a, 0, a.length-1);
    }

    
    private static void quicksort(double a[], int primero, int ultimo)
{
	 int i, j, central;
	 double pivote;
	 central = (primero + ultimo)/2;
	 pivote = a[central];
	 i = primero;
	 j = ultimo;
	 do {
	 	 while (a[i] < pivote) i++;
	 	 while (a[j] > pivote) j--;
	 	 if (i <= j)
	 	 {
	 	 	 intercambiar(a, i, j);
	 	 	 i++;
	 	 	 j--;
	 	 }
	 }while (i <= j);
	 if (primero < j)
	 	 quicksort(a, primero, j); // mismo proceso con sublista izqda
	 if (i < ultimo)
	 	 quicksort(a, i, ultimo); // mismo proceso con sublista drcha
}

    private static void intercambiar(double[] a, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
