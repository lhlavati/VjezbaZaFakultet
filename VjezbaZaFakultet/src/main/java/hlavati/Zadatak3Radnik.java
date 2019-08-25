/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

import java.io.Serializable;

/**
 *
 * @author Luka
 */
public class Zadatak3Radnik implements Serializable{
    
    private int id;
    private String ime;
    private String prezime;
    private String vrsta_posla;

    public Zadatak3Radnik(int id, String ime, String prezime, String vrsta_posla) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.vrsta_posla = vrsta_posla;
    }
    
    public Zadatak3Radnik(){
        
    }
    
    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getVrsta_posla() {
        return vrsta_posla;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setVrsta_posla(String vrsta_posla) {
        this.vrsta_posla = vrsta_posla;
    }
    
    
}
