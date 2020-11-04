/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Tugce Kocak
 */
public class Otcul extends Hayvan{
    
    public Otcul(String isim, String tur) {
        super(isim, tur);
    }

    @Override
    void beslen(Canli canli) {
        if(canli instanceof Bitki){
            System.out.println(this.isim+" "+((Hayvan) canli).isim +" yedi");
            this.yemekListesi.add(canli);
        }else{
            System.out.println(this.isim+" ot harici yemez.");
        }
    }
    
}
