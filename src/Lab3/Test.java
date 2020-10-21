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
public class Test {
    
    public static void main(String[] args) {
        Bayi bayi1=new Bayi("fsm", 1453);
        Bayi b=new Bayi();
        Arac a=new Arac("Mercedes", "model1", 2000,2020);
        Arac a1=new Arac("BMW","Model2",1000,2010);
        Otomobil o1=new Otomobil("abc", "111", 1000, 2000, 100);
        Kamyon k1=new Kamyon("abc", "222", 10, 20, 30);
        bayi1.aracEkle(a);
        bayi1.aracEkle(a1);
        bayi1.aracEkle(o1);
        bayi1.aracEkle(k1);

        bayi1.aracSayilari();
        System.out.println(bayi1.otomobillerinSatisFiyati());
    }
}
