/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tugce Kocak
 */
public class MetinIO2 {
    public static void main(String[] args) {
        File newFile=new File("metin.txt");
            Scanner input;
            int count=0;
            char deleted='ç';
            String text="";
        try {
            input = new Scanner(newFile);
            while(input.hasNext()){
                String kelime=input.next();
                if(kelime.contains(""+"ç")){
                   text+=kelime.replaceAll(""+"ç", "")+" ";
                   count++;
                }else{
                    text+=kelime+" ";
                }
               
            }
            
             System.out.println(text);
             PrintWriter writer = new PrintWriter(newFile);
             writer.printf(text);
             writer.flush();
             writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetinIO2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
}
