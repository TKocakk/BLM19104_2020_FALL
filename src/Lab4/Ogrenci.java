/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.ArrayList;

/**
 *
 * @author Tugce Kocak
 */
public class Ogrenci {
    ArrayList<Integer> notlar=new ArrayList();
    String isim;
    void notEkle(int not) throws KucukDegerHatasi,BuyukDegerHatasi{
        if(not<0){
            throw new KucukDegerHatasi(not);
        }else if(not>100){
            throw new BuyukDegerHatasi(not);
        }else{
            notlar.add(not);
        }
        
    }
    void notYazdır(){
        System.out.println(notlar);
       
    }
}
