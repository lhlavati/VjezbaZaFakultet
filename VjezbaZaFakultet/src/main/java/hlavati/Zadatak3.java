/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Pretpostaviti da postoji implementacija klase Radnik (id, ime, prezime,
   vrsta_posla) uključujući set i get metode. U klasi Test učitati serijalizirane
   podatke iz datoteke (naziv datoteke možete odabrati sami) u objekte klase Radnik
   ispisati informacije o svakom radniku uz pomoć dostupnih set i get metoda
   (pretpostaviti da postoji 10 radnika). Opisati ukratko u kojim situacijama se koristi
   serijalizacija i što ona predstavlja?
*/

public class Zadatak3 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("PopisRadnika.txt");
            try {
                ObjectInputStream ois = new ObjectInputStream(fis);
                Zadatak3Radnik radnici = new Zadatak3Radnik();
                try {
                    radnici = (Zadatak3Radnik) ois.readObject();
                    for (int i = 0; i < 10; i++) {
                        System.out.println(radnici.getId() + " " + radnici.getIme() + " " + radnici.getPrezime() + " " + radnici.getVrsta_posla());
                    }
                    ois.close();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Zadatak3.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Zadatak3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Zadatak3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
