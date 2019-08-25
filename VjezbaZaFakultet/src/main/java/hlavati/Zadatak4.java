/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

/* 
   Napisati programski kod koji definira grafičko sučelje prikazano slikom.
   ## SLIKA JEDNOSTAVNOG KALKULATORA KOJI SADRŽI BROJEVE OD 0-9, =, C,            ##
   ## ČETIRI NAJJEDNOSTAVNIJE MATEMATIČKE OPERACIJE I JEDAN TEXTFIELD ZA REZULTAT ##
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Zadatak4 extends JFrame {
    JTextField txt;
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnJednako;
    JButton btnC;
    JButton btnPlus;
    JButton btnMinus;
    JButton btnDjeljenje;
    JButton btnPuta;

    Zadatak4() {
        setSize(400,400);
        setLayout(new GridLayout(5, 4));
        txt = new JTextField();
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnJednako = new JButton("=");
        btnC = new JButton("C");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnPuta = new JButton("*");
        btnDjeljenje = new JButton("/");
        
        add(txt);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnPlus);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnMinus);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btnDjeljenje);
        add(btn0);
        add(btnJednako);
        add(btnC);
        add(btnPuta);
        
    }

    public static void main(String[] args) {
        new Zadatak4().setVisible(true);
    }
}

