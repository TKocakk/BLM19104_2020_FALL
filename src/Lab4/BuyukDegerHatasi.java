/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Tugce Kocak
 */
public class BuyukDegerHatasi extends Exception{
     public BuyukDegerHatasi (Integer sayi){
        super("Buyuk Deger hatasi oluştu: "+ sayi+ " not olarak eklenemez.");
    }
}
