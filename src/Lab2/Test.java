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
public class Test {
    
    public static void main(String[] args) {
        Bayi bayi1=new Bayi("fsm", 1453);
        Bayi b=new Bayi();
        Arac a=new Arac("Mercedes", "model1", 2000,2020);
        Arac a1=new Arac("BMW","Model2",1000,2010);
        bayi1.aracEkle(a);
        bayi1.aracEkle(a1);
  //      bayi1.aracEkle(a); //eklenmedi
        
//        bayi1.araclariListele();
       
//        System.out.println("--------------------");
//        bayi1.araclariListele();
        
        Kullanici k=new Kullanici("Tayyip", "KAYMAK");
       
        bayi1.aracSat(a1,k);
        k.aracListele();
        
        //System.out.println(a.SatisFiyati());
//        Otomobil o=new Otomobil("Toyota", "model3", 1500, 2000, 3000);
//        Kamyon km=new Kamyon("marka1", "model4", 4000, 2000, 6000);
//        System.out.println(km.SatisFiyati());
//        System.out.println(o.SatisFiyati());

        System.out.println(a1.getKullanici());
    }
}
