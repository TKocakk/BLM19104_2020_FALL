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
public class Otomobil extends Arac{
    
    int silindir_hacmi;
    
    public Otomobil(String marka, String model, int maliyet, int uretimYili, int silindirHacmi) {
        super(marka, model, maliyet, uretimYili);
        this.silindir_hacmi=silindirHacmi;
    }
    
    int SatisFiyati(){
        return this.maliyet+this.silindir_hacmi*3;
    }
}
