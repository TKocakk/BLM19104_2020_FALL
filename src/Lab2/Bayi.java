/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.ArrayList;

/**
 *
 * @author Tugce Kocak
 */
public class Bayi {
    
    private String isim;
    private int kurulusYili;
    ArrayList<Arac> araclar;
    int AracSayisi;
    
    Bayi(String isim, int kurulus){
        this.isim=isim;
        this.kurulusYili=kurulus;
        araclar=new ArrayList<>();
        
    }
    Bayi(){
    
    }
    void aracEkle(Arac a){
        if(!araclar.contains(a)){
            araclar.add(a);
            AracSayisi++;
        }
        else{
            System.out.println("Arac bayide mevcut");
        }
    }
    
    void araclariListele(){
        for (int i = 0; i < araclar.size(); i++) {
            System.out.println(araclar.get(i).marka+" "+araclar.get(i).model);
        }
    }
    
    void aracSat(Arac a, Kullanici k){
        if(araclar.contains(a)){
             araclar.remove(a);
             AracSayisi--;
             k.aracEkle(a);
             a.setKullanici(k);
        }
        
    }
    void aracSat(Arac a){
        if(araclar.contains(a)){
             araclar.remove(a);
             AracSayisi--;
        }
    }
}
