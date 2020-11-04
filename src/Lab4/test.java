/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tugce Kocak
 */
public class test {
    public static void main(String[] args) {
        try {
            Ogrenci o1=new Ogrenci();
            try {
                
                o1.notEkle(105);
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            o1.notEkle(-5);
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } 
    }
}
