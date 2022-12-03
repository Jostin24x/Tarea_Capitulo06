/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_capitulo6;

/**
 *
 * @author ACER
 * 4. Ordenación Shell:La ordenación Shell debe el nombre a su inventor, D. L. Shell. Se suele denominar también
ordenación por inserción con incrementos decrecientes. Se considera que el método Shell es una
mejora del método de inserción directa
 */
public class Ejercico_04 {

    /**
     * @param args the command line arguments
     */
    public static void ordenacionShell(double a[]) {
         int intervalo, i, j, k;
	 int n= a.length;
	 intervalo = n / 2;
	 while (intervalo > 0)
	 {
	 	 for (i = intervalo; i < n; i++)
	 	 {
	 	 	 j = i - intervalo;
	 	 	 while (j >= 0)
	 	 	 {
	 	 	 	 k = j + intervalo;
	 	 	 	 if (a[j] <= a[k])
	 	 	 	 	 j = -1; // par de elementos ordenado
	 	 	 	 else
	 	 	 	 {
	 	 	 	 	 intercambiar(a, j, j+1);
	 	 	 	 	 j -= intervalo;
	 	 	 	 }
	 	 	 }
	 	 }
	 	 intervalo = intervalo / 2;
	 }
    }

    private static void intercambiar(double[] a, int j, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
