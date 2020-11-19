
package Lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tugce Kocak
 */
public class ZamHesaplayici extends JFrame{
    JTextField jtfYillikZam = new JTextField();
    JTextField jtfKidem = new JTextField();
    JTextField jtfMaas = new JTextField();
    JTextField jtfZamli = new JTextField();
    JButton zambutonu=new JButton("Zamlı Maaşı Hesapla");
    public ZamHesaplayici(){
        JPanel panel=new JPanel(new GridLayout(5,2));
        panel.setBorder(new TitledBorder("Maas miktarını,zam oranını ve kıdem bilgisini giriniz"));
        
        panel.add(new JLabel("Yıllık zam oranı"));
        panel.add(jtfYillikZam);
        
        panel.add(new JLabel("Kıdem"));
        panel.add(jtfKidem);
        
        panel.add(new JLabel("Su anki maas"));
        panel.add(jtfMaas);
        
        panel.add(new JLabel("Zamlı maaas"));
        panel.add(jtfZamli);
        
        JPanel panel2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel2.add(zambutonu);
        add(panel,BorderLayout.CENTER);
        add(panel2,BorderLayout.SOUTH);
        this.addWindowListener(new pencereDinleyici());
        zambutonu.addMouseListener(new mouseDinle());
        this.addKeyListener(new klavyeDinle());
        zambutonu.addActionListener(new butonDinle());
    }
    public class pencereDinleyici extends WindowAdapter{
        @Override
        public void windowOpened(WindowEvent e){
            System.out.println("Uygulamaya hoşgeldiniz!"); 
        }
        @Override
        public void windowIconified(WindowEvent e){
            System.out.println("Program küçültüldü!");
        }
    }
    public class mouseDinle extends MouseAdapter{
        public void mouseEntered(MouseEvent e){
            zambutonu.setForeground(Color.red);
        }
        public void mouseExited(MouseEvent e){
            zambutonu.setForeground(null);
        }
    }
    public class klavyeDinle extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode()== KeyEvent.VK_E){
                System.out.println("E tuşuna basıldı program sonlandı.");
                System.exit(0);
            }
        }
    }
    public class butonDinle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double yzo=Double.parseDouble(jtfYillikZam.getText());
            int kidem=Integer.parseInt(jtfKidem.getText());
            jtfZamli.setText(yzo*kidem+"");
        }
    
    }
    public static void main(String[] args) {
        ZamHesaplayici frame=new ZamHesaplayici();
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Zam Hesaplayıcı");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
