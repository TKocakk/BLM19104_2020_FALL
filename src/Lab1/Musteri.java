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
class Musteri {
    Kitap [] alinanKitaplar=new Kitap[3];
    int alinanKitapSayisi;
    
    void kitapEkle(Kitap k){
        for (int i = 0; i < alinanKitaplar.length; i++) {
            if(alinanKitaplar[i]==null){
                alinanKitaplar[i]=k;
                alinanKitapSayisi++;
                break;
            }
        }
        if(alinanKitapSayisi>=3){
            System.out.println("Daha fazla kitap alamazsınız");
        }
    }
    
    void kitaplar(){
        for (int i = 0; i < alinanKitaplar.length; i++) {
            if(alinanKitaplar[i]!=null){
                System.out.println(alinanKitaplar[i].getIsim());
            }
            
        }
    }
    void kitapBirak(Kitap k){
        for (int i = 0; i < alinanKitaplar.length; i++) {
            if(alinanKitaplar[i].equals(k)){
                alinanKitaplar[i]=null;
                alinanKitapSayisi--;
                System.out.println(k.isim+ " kitabı bırakıldı.");
            }
        }
    }
    
}
