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
public class HataKontrol_1 {
    static int diziTopla(int [] dizi, int size){
        int sum=0;
        System.out.println("1");
        try{
            System.out.println("2");
            for (int i = 0; i < size; i++) {
                sum+=dizi[i];
            }
            System.out.println("3");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index hatası "+ e);
        }
        catch (Exception e){
            System.out.println("Bir Hata alındı "+  e);
        }
        finally{
            System.out.println("4");
        }
        return sum;
    }
    
    static int diziTopla2(int [] dizi, int size){
        int sum=0;
        System.out.println("1");
        for (int i = 0; i < size; i++) {
                sum+=dizi[i];
            }
        System.out.println("2");
        return sum;
    }
    public static void main(String[] args) {
         int [] dizi1 = {1,2,3,4};
        //System.out.println("Toplam= " + diziTopla(dizi1, 3) );
        try{
            System.out.println("3");
           System.out.println("Toplam= "+ diziTopla2(dizi1, 5));
            System.out.println("4");
        }
        catch(Exception e){
            System.out.println("mainde hata");
        }
        
    }
}
