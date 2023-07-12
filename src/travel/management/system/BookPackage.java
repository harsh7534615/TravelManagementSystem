package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    
    Choice cpackage;
    JTextField tfpersons;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    String username;
    
    BookPackage(String username){
        this.username=username;
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(400,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,70,100,25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(250,70,200,25);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,25);
        add(lblpackage);
        
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Normal Package");
        cpackage.setBounds(250,110,200,25);
        add(cpackage);
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpersons.setBounds(40,150,150,25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,190,150,25);
        add(lblid);
        
        labelid = new JLabel("");
        labelid.setBounds(250,190,200,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,25);
        add(lblnumber);
        
        labelnumber = new JLabel("");
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,270,150,25);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250,270,200,25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,310,150,25);
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,310,150,25);
        add(labelprice);
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,380,120,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,380,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,380,120,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
        
        
        try{
            Conn c= new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprice){
            String pack= cpackage.getSelectedItem();
            int persons = Integer.parseInt(tfpersons.getText());
            int cost=0;
            switch (pack) {
                case "Gold Package" -> {
                    cost+=12000*persons;
                }
                case "Silver Package" -> {
                    cost+=25000*persons;
                }
                default -> {
                    cost+=32000*persons;
                }
            }
            labelprice.setText("Rs" + cost);
            
        }
        else if(ae.getSource() == bookpackage){
            if(labelprice.getText().equals("")){
                String pack= cpackage.getSelectedItem();
                int persons = Integer.parseInt(tfpersons.getText());
                int cost=0;
                switch (pack) {
                    case "Gold Package" -> {
                        cost+=12000*persons;
                    }
                    case "Silver Package" -> {
                        cost+=25000*persons;
                    }
                    default -> {
                        cost+=32000*persons;
                    }
                }
                labelprice.setText("Rs" + cost);
            }
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[]args){
        new BookPackage("harry");
    }
}
