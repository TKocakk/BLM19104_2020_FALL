/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author Tugce Kocak
 */
class Arac {
    String marka;
    String model;
    int maliyet, uretimYili;
    Kullanici k;

    public Arac(String marka, String model, int maliyet, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.maliyet = maliyet;
        this.uretimYili = uretimYili;
    }

    @Override
    public String toString() {
        return "Arac{" + "marka=" + marka + ", model=" + model + ", maliyet=" + maliyet + ", uretimYili=" + uretimYili + '}';
    }
    
    int SatisFiyati(){
        return maliyet*2;
    }
    
    void setKullanici(Kullanici k){
        this.k=k;
    }
    
    Kullanici getKullanici(){
        return k;
    }
    
    
}
