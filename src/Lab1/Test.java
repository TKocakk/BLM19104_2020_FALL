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
public class Test {
    public static void main(String[] args) {
        Kitap k=new Kitap();
        k.setIsim("Zambak");
        Kitap k1=new Kitap("Beyaz Diş");
        Kitap k2=new Kitap("Uçurtma Avcısı");
        Kitap k3=new Kitap("Zambak");
        Kutuphane kutuphane=new Kutuphane();
        kutuphane.kitapEkle(k);
        kutuphane.kitapEkle(k1);
       // System.out.println(kutuphane.getKitapSayisi());
        Musteri Ali=new Musteri();
        Ali.kitapEkle(k);
        Ali.kitapEkle(k1);
        Ali.kitapEkle(k2);
      
        Ali.kitaplar();
        Ali.kitapBirak(k);
        System.out.println("---------------");
        Ali.kitaplar();
        
    }
}
