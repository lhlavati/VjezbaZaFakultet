/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

import java.util.Scanner;

/* Napisati višenitni program koji se sastoji od klase Test i od klase Brojac koja
   implementira sučelje Runnable. Klasa Brojac(konstruktor) kao parametar prima parametar
   (0 ili 1). Ako primi <<0>> nit treba ispisivati parne brojeve 15 sekundi. Ako primi <<1>>
   treba ispisivati neparne brojeve 10 sekundi
*/

public class Zadatak2{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.println("Unesite 0 ili 1: ");
            n = input.nextInt();
        } while(n != 1 && n != 0);
        
        Brojac brojac = new Brojac(n);
        brojac.run();
    }
    
}

class Brojac implements Runnable{
    private int n;
    
    public Brojac(int n){
        this.n = n;
    }

    @Override
    public void run() {
        if(n == 0)
            for(int i = 2; i < 32; i+=2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(i);
            }
        if(n == 1)
            for(int i = 1; i < 20; i+=2){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println(i);
            }
    }
}
