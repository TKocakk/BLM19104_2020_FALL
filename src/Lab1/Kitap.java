/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Tugce Kocak
 */
class Kitap {
    String isim;
    Yazar yazar;
    boolean alindiMi;
    int sayfaSayisi;
    

    Kitap (){
    
    }
    Kitap(String isim) {
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
