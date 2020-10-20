/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.ArrayList;

/**
 *
 * @author Tugce Kocak
 */
public class Kutuphane {
    ArrayList <Kitap> kitaplar =new ArrayList<>();
    ArrayList <Musteri> musteriler =new ArrayList<Musteri>();
    private int kitapSayisi;
    
    void kitapEkle(Kitap k){
        kitaplar.add(k);
        kitapSayisi++;
    }
    int getKitapSayisi(){
        return kitapSayisi;
    }
    
}
