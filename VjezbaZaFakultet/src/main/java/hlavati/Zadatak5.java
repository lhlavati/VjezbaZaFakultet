/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

/* Napisati implementaciju abstract klase Shape te pripadajućih klasa Circle i
   Rectangle kako bi unutar main programa bilo moguće napisati (draw metoda treba
   samo na ekran ispitivati radnju npr. <<Drawing circle>> ili <<Drawing rectangle>>):
                            Shape sh1 = new Circle().draw();
*/

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class Zadatak5 {
    
    Shape sh1 = new Circle().draw();
    
    
}
