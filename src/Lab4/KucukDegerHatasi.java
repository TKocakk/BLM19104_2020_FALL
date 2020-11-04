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
public class KucukDegerHatasi extends Exception {
    public KucukDegerHatasi (Integer sayi){
        super("Kucuk Deger hataasi oluştu: "+ sayi+ " not olarak eklenemez.");
    }
}
