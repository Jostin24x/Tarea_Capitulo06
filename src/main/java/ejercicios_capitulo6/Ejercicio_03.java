/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_capitulo6;

/**
 *
 * @author ACER
 * 3. Ordenación por inserción:El método de ordenación por inserción es similar al proceso típico de ordenar tarjetas de nombres
(cartas de una baraja) por orden alfabético consistente en insertar un nombre en su posición
correcta dentro de una lista que ya está ordenada.
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void ordInsercion (int [] a) {
        int i, j;
	 int aux;
	 for (i = 1; i < a.length; i++)
	 {
	 	 /*	 indice j es para explorar la sublista a[i-1]..a[0] buscando la
	 	 posicion correcta del elemento destino*/
	 	 j = i;
	 	 aux = a[i];	
	 	 // se localiza el punto de inserción explorando hacia abajo
	 	 while (j > 0 && aux < a[j-1])
	 	 {
	 	 	 // desplazar elementos hacia arriba para hacer espacio
	 	 	 a[j] = a[j-1];
	 	 	 j--;
	 	 }
	 	 a[j] = aux;
	 }
    }
    
}
