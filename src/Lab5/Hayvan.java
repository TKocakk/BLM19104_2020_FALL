/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;

/**
 *
 * @author Tugce Kocak
 */
public abstract class Hayvan extends Canli{
    ArrayList<Canli> yemekListesi=new ArrayList();
    public Hayvan(String isim, String tur) {
        super(isim, tur);
    }
    abstract void beslen(Canli canli);
    void yazdir(){
        for (int i = 0; i < yemekListesi.size(); i++) {
            System.out.println(yemekListesi.get(i).isim);
        }
    }
}
