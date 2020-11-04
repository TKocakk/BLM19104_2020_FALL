/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tugce Kocak
 */
public class MetinIO {
    public static void main(String[] args) {
        ArrayList <Integer> liste=new ArrayList();
        try {
            
            File newFile=new File("sayilar.txt");
            Scanner input=new Scanner(newFile);
            
            while(input.hasNext()){
                // System.out.println(input.nextInt());
                liste.add(input.nextInt());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetinIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int toplam=0;
        for (int i = 0; i < liste.size(); i++) {
            toplam+=liste.get(i);
        }
        System.out.println(toplam);
        int ort= toplam/liste.size();
        System.out.println(ort);
        
        File dosya2=new File("sonuclar.txt");
        try {
            PrintWriter writer = new PrintWriter(dosya2);
            writer.printf("Toplam= "+ toplam+"\n");
            writer.printf("Ortalama= "+ ort);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetinIO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
}
