/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Tugce Kocak
 */
public class Soru4 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JLabel label =new JLabel();
        label.setText("label");
        label.setVisible(true);
        f.add(label);
        
        JTextField text=new JTextField();
        text.setText("text");
        text.setVisible(true);
        f.add(text);
        
        JButton buton=new JButton();
        buton.setText("buton");
        buton.setVisible(true);
        f.add(buton);
        
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
