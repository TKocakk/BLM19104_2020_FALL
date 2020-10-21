/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class Kamyon extends Arac{
    
    int agirlik;
    
    public Kamyon(String marka, String model, int maliyet, int uretimYili,int agirlik) {
        super(marka, model, maliyet, uretimYili);
        this.agirlik=agirlik;
    }
    
    
    int SatisFiyati(){
        return this.maliyet+this.agirlik*6;
    }
}
