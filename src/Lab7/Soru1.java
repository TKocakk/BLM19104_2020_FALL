
package Lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tugce Kocak
 */
public class Soru1 extends JFrame{
    public Soru1(){
        JButton b1=new JButton("1-start");
        JButton b2=new JButton("2-Continue");
        JButton b3=new JButton("3-Continue");
        JButton b4=new JButton("4-Finish");
        JPanel panel =new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        add(panel);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start Clicked!");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I am in the middle!");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I am in the middle, but close to the finish");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is Finish Button");
            }
        });
    }
    public static void main(String[] args) {
        Soru1 frame=new Soru1();
        //frame.setSize(400,80);
        frame.setTitle("My Listener Demo");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
