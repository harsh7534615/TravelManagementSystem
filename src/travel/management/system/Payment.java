package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    
    JButton pay,back;
    
    Payment(){
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,200,800,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        
        pay = new JButton("Pay");
        pay.setBounds(420,5,80,40);
        pay.addActionListener(this);
        image.add(pay);
        
        back = new JButton("Back");
        back.setBounds(520,5,80,40);
        back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){
            setVisible(false);
            new Paytm();
        }
        else {
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new Payment();
    }
}
