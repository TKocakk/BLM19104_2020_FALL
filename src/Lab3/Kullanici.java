/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.ArrayList;

/**
 *
 * @author Tugce Kocak
 */
public class Kullanici {
    String ad;
    String soyad;
    ArrayList<Arac> araclar;

    public Kullanici(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        araclar=new ArrayList<>();
    }
    
    void aracEkle(Arac a){
        if(!araclar.contains(a)){
            a.setKullanici(this);
            araclar.add(a);
            System.out.println("Arac Satın Alınmıstır");
        }
        else{
            System.out.println("Arac zaten alınmıştır");
        }
    }
    
    void aracListele(){
        for (Arac arac : araclar) {
            System.out.println(arac);
        }
    }

    @Override
    public String toString() {
        return "ad=" + ad + ", soyad=" + soyad;
    }
  
}
