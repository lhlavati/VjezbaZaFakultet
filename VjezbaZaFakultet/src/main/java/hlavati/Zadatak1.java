/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;


/**
 *
 * @author Luka
 */

/* Napisati sučelje <<Matrice>> koje sadrži dvije metode <<glavna>> i <<sporedna>>. U klasi
   Test koja koristi navedeno sučelje implementirati metoda koje će nad zadanom kvadratnom 
   matricom A s N redaka i N stupaca izračunati sumu glavne i sporedne dijagonale. Rezultat
   te dvije metode usporediti i napisati koja vrijednost je veća (npr. Suma elemenata glavne
   dijagonale je veća). Možemo pretpostaviti da je matrica već popunjena.
*/
public class Zadatak1 implements Matrice {
    
    public static void main(String[] args) {

        Zadatak1 diagonale = new Zadatak1();
        
        int matrica[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        if(diagonale.glavna(matrica, 3) > diagonale.sporedna(matrica, 3))
            System.out.println("Suma elemenata glavne dijagonale je veca!");
        else if(diagonale.glavna(matrica, 3) < diagonale.sporedna(matrica, 3))
            System.out.println("Suma elemenata sporedne dijagonale je veca!");
        else
            System.out.println("Suma elemenata glavne i sporedne dijagonale je jednaka!");
    }

    @Override
    public int glavna(int[][] m, int n) {
        int rez = 0;
        
        for(int i = 0; i < n; i++){
            rez += m[i][i];
        }
        return rez;
    }

    @Override
    public int sporedna(int[][] m, int n) {
        int rez = 0;
        
        for(int i = 0; i< n; i++){
            rez += m[i][n - i - 1];
        }
        return rez;
    }
}

interface Matrice{
    public int glavna(int[][] m, int n);
    public int sporedna(int[][] m, int n);
}