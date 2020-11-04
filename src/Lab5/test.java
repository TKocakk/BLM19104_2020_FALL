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
public class test {
    public static void main(String[] args) {
        Hayvan aslan=new Etcil("aslan","memeli");
        Hayvan ceylan=new Otcul("ceylan","memeli");
        aslan.beslen(ceylan);
        Bitki b=new Bitki("papatya","çiçek");
        aslan.beslen(b);
        aslan.yazdir();
    }
}
