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
    
    void aracSayilari(){
        int otomobilSayisi=0;
        int kamyonSayisi=0;
           for (Arac arac : araclar) {
               if(arac instanceof Otomobil){
                   otomobilSayisi++;
               }
               if(arac instanceof Kamyon){
                   kamyonSayisi++;
               }
        }
           System.out.println("Bayideki otomobil sayısı: "+ otomobilSayisi);
           System.out.println("Bayideki kamyon sayısı: "+ kamyonSayisi);
           System.out.println("Bayideki toplam eleman sayısı "+ araclar.size());
    }
    
    int otomobillerinSatisFiyati(){
          int toplamFiyat=0;
          for (Arac arac : araclar) {
              if (arac instanceof Otomobil){
                toplamFiyat+=arac.SatisFiyati();
              }
        }
          return toplamFiyat;
    }
}
