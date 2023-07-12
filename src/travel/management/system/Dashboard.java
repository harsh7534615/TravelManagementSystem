package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addpersonalDetails,viewpersonalDetails,deletepersonalDetails,
            updatepersonalDetails,checkPackages,
            bookPackages,viewPackages,viewHotels,
            destinations,bookHotel,viewBookedHotel,
            Payments,calculator,notepad,about;
    
    Dashboard(String username){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        //header
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,55);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        
        //left box
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,55,300,900);
        add(p2);
        
        addpersonalDetails = new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0,0,300,50);
        addpersonalDetails.setBackground(new Color(0,0,102));
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahome",Font.PLAIN,20));
        addpersonalDetails.setMargin(new Insets(0,0,0,60));
        addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);
        
        updatepersonalDetails = new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0,50,300,50);
        updatepersonalDetails.setBackground(new Color(0,0,102));
        updatepersonalDetails.setForeground(Color.WHITE);
        updatepersonalDetails.setFont(new Font("Tahome",Font.PLAIN,20));
        updatepersonalDetails.setMargin(new Insets(0,0,0,35));
        updatepersonalDetails.addActionListener(this);
        p2.add(updatepersonalDetails);
        
        viewpersonalDetails = new JButton("View Details");
        viewpersonalDetails.setBounds(0,100,300,50);
        viewpersonalDetails.setBackground(new Color(0,0,102));
        viewpersonalDetails.setForeground(Color.WHITE);
        viewpersonalDetails.setFont(new Font("Tahome",Font.PLAIN,20));
        viewpersonalDetails.setMargin(new Insets(0,0,0,135));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);
        
        deletepersonalDetails = new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0,150,300,50);
        deletepersonalDetails.setBackground(new Color(0,0,102));
        deletepersonalDetails.setForeground(Color.WHITE);
        deletepersonalDetails.setFont(new Font("Tahome",Font.PLAIN,20));
        deletepersonalDetails.setMargin(new Insets(0,0,0,35));
        deletepersonalDetails.addActionListener(this);
        p2.add(deletepersonalDetails);
        
        checkPackages = new JButton("Check Package");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahome",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Package");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahome",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,120));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        viewPackages = new JButton("View Package");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahome",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0,0,0,120));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahome",Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0,0,0,140));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0,400,300,50);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahome",Font.PLAIN,20));
        bookHotel.setMargin(new Insets(0,0,0,150));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahome",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,75));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahome",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,130));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        Payments = new JButton("Payments");
        Payments.setBounds(0,550,300,50);
        Payments.setBackground(new Color(0,0,102));
        Payments.setForeground(Color.WHITE);
        Payments.setFont(new Font("Tahome",Font.PLAIN,20));
        Payments.setMargin(new Insets(0,0,0,155));
        Payments.addActionListener(this);
        p2.add(Payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahome",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,155));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahome",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,165));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahome",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        
        
        //right box
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addpersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource() == viewpersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatepersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource() == deletepersonalDetails){
            new DeleteDetails(username);
        }
        else if(ae.getSource() == checkPackages){
            new CheckPackage();
        }
        else if(ae.getSource() == bookPackages){
            new BookPackage(username);
        }
        else if(ae.getSource() == viewPackages){
            new ViewPackage(username);
        }
        else if(ae.getSource() == viewHotels){
            new CheckHotels();
        }
        else if(ae.getSource() == destinations){
            new Destinations();
        }
        else if(ae.getSource() == bookHotel){
            new BookHotel(username);
        }
        else if(ae.getSource() == viewBookedHotel){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource() == Payments){
            new Payment();
        }
        else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == about){
            new About();
        }
    }
    
    
    public static void main(String[] args){
        new Dashboard("harry");
    }
}
